package repository.connection

import WsResponse
import io.ktor.http.cio.websocket.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import model.WsConnection
import java.util.*

class ConnectionsRepository : IConnectionsRepository {
    private val connections = Collections.synchronizedSet(mutableSetOf<WsConnection>())

    override fun addConnection(connection: WsConnection) {
        connections.add(connection)
    }

    override fun removeConnection(connection: WsConnection) {
        connections.remove(connection)
    }

    override suspend fun sendToAll(wsResponse: WsResponse) {
        val encodedResponse = Json.encodeToString(wsResponse)
        for (connection in connections) {
            connection.connection.send(encodedResponse)
        }
    }
}