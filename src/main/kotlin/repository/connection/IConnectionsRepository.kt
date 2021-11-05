package repository.connection

import WsResponse
import model.WsConnection

/// Stores all application web socket connections
interface IConnectionsRepository {
    fun addConnection(connection: WsConnection)

    fun removeConnection(connection: WsConnection)

    suspend fun sendToAll(wsResponse: WsResponse)
}