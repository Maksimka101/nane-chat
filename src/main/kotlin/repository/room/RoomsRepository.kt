package repository.room

import model.CreateMessage
import model.Message
import model.Room
import model.User
import repository.message.IMessagesRepository
import java.time.LocalDateTime
import java.util.*

val testRoom = Room("mock room", Message("mock room", LocalDateTime.now(), User("mock user"), "mock message"))

class RoomsRepository(private val messagesRepository: IMessagesRepository) : IRoomsRepository {
    private val rooms = Collections.synchronizedMap(mutableMapOf("mock room" to testRoom))

    override fun loadAllRooms(): List<Room> {
        return rooms.values.toList()
    }

    override suspend fun createRoom(sender: String, createMessage: CreateMessage): Room {
        val message = messagesRepository.saveMessage(sender, createMessage)

        val room = Room(createMessage.room, message)
        rooms[room.name] = room

        return room
    }

    override suspend fun createMessage(sender: String, createMessage: CreateMessage): Message {
        val room = tryGetRoom(createMessage.room)
        if (room == null) {
            return createRoom(sender, createMessage).lastMessage
        } else {
            val message = messagesRepository.saveMessage(sender, createMessage)

            updateRoom(room.name, message)
            return message
        }
    }

    private fun updateRoom(roomName: String, lastMessage: Message) {
        rooms[roomName] = rooms[roomName]?.copy(lastMessage = lastMessage)
    }

    override fun tryGetRoom(roomName: String): Room? {
        return rooms[roomName]
    }
}