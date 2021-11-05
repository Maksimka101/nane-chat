package route.ws

import WsRequest
import WsResponse
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.http.cio.websocket.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.websocket.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import model.CreateMessage
import model.WsConnection
import org.koin.ktor.ext.inject
import repository.connection.IConnectionsRepository
import repository.room.IRoomsRepository

fun Application.wsRoute() {
    routing {
        val connectionsRepository: IConnectionsRepository by inject()
        val roomsRepository: IRoomsRepository by inject()

        webSocket("/ws") {
            val userName = call.request.queryParameters["username"] ?: return@webSocket call.respond(
                HttpStatusCode.BadRequest
            )

            val connection = WsConnection(this)

            connectionsRepository.addConnection(connection)

            try {
                for (event in incoming) {
                    when (event) {
                        is Frame.Text -> {
                            val eventText = event.readText()
                            var wsRequest: WsRequest
                            try {
                                wsRequest = Json.decodeFromString(eventText)
                            } catch (e: Exception) {
                                call.respond(HttpStatusCode.BadRequest)
                                continue
                            }

                            val createdMessage = roomsRepository.createMessage(
                                userName,
                                CreateMessage(wsRequest.room, wsRequest.text, wsRequest.id)
                            )

                            connectionsRepository.sendToAll(
                                WsResponse(
                                    createdMessage.room,
                                    createdMessage.text,
                                    wsRequest.id,
                                    createdMessage.created,
                                    createdMessage.sender
                                )
                            )
                        }
                        else -> {
                            call.respond(HttpStatusCode.BadRequest, "Only text is supported")
                        }
                    }
                }
            } finally {
                connectionsRepository.removeConnection(connection)
            }
        }
    }
}
