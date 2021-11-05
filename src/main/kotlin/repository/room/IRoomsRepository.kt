package repository.room

import model.CreateMessage
import model.Message
import model.Room

interface IRoomsRepository {
    fun loadAllRooms(): List<Room>

    suspend fun createRoom(sender: String, createMessage: CreateMessage): Room

    // Creates new message and updates room.
    // Saves this message to the [IMessagesRepository]
    // Optionally creates room if needed
    suspend fun createMessage(sender: String, createMessage: CreateMessage): Message

    fun tryGetRoom(roomName: String): Room?
}