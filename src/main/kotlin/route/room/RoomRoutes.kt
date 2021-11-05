import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject
import repository.message.IMessagesRepository
import repository.room.IRoomsRepository

fun Route.routeRooms() {
    route("/rooms") {
        roomsList()
        roomsHistory()
    }
}

private fun Route.roomsList() {
    val roomsRepository: IRoomsRepository by inject()

    get {
        val rooms = roomsRepository.loadAllRooms()
        call.respond(HttpResponse(rooms))
    }
}

private fun Route.roomsHistory() {
    val messagesRepository: IMessagesRepository by inject()

    get("{name}/history") {
        val roomName = call.parameters["name"] ?: return@get call.respond(HttpStatusCode.BadRequest)

        val history = messagesRepository.loadAllRoomMessages(roomName) ?: return@get call.respond(
            HttpStatusCode.BadRequest
        )

        call.respond(HttpResponse(history))
    }
}
