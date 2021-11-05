package repository.message

import model.CreateMessage
import model.Message

interface IMessagesRepository {
    fun loadAllRoomMessages(roomName: String): List<Message>?

    // This method shouldn't be used directly to prevent inconsistency
    fun saveMessage(sender: String, createMessage: CreateMessage): Message
}