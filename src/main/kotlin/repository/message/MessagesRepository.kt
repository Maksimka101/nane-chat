package repository.message

import model.CreateMessage
import model.Message
import model.User
import java.time.LocalDateTime
import java.util.*

class MessagesRepository : IMessagesRepository {
    private val messages = Collections.synchronizedMap(mutableMapOf<String, MutableList<Message>?>())
    private val messagesLimit = 100_000

    override fun loadAllRoomMessages(roomName: String): List<Message>? = messages[roomName]

    override fun saveMessage(sender: String, createMessage: CreateMessage): Message {
        val roomName = createMessage.room
        var roomMessages = messages[roomName]
        if (roomMessages == null) {
            roomMessages = Collections.synchronizedList(mutableListOf<Message>())
            messages[roomName] = roomMessages
        }

        val message = Message(roomName, LocalDateTime.now(), User(sender), createMessage.text)
        saveCheckingMessageLimit(roomMessages!!, message)

        return message
    }

    private fun saveCheckingMessageLimit(messages: MutableList<Message>, message: Message) {
        if (messages.size > messagesLimit) {
            repeat((messagesLimit * 0.2).toInt()) {
                messages.removeFirst()
            }
        }

        messages.add(message)
    }
}
