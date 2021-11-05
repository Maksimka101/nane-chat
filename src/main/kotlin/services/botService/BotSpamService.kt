package services.botService

import WsResponse
import kotlinx.coroutines.delay
import model.CreateMessage
import model.User
import repository.botSpam.IBotSpamRepository
import repository.connection.IConnectionsRepository
import repository.room.IRoomsRepository
import java.time.LocalDateTime

class BotSpamService(
    private val botSpamRepository: IBotSpamRepository,
    private val connectionsRepository: IConnectionsRepository,
    private val roomsRepository: IRoomsRepository
) {
    // 10 seconds delay in milliseconds
    private val spamDelay = 1000L * 10;
    private var doSpam = false

    suspend fun startSpamming() {
        doSpam = true
        while (doSpam) {
            sendSpamMessage()
            delay(spamDelay)
        }
    }

    fun stopSpamming() {
        doSpam = false
    }

    private suspend fun sendSpamMessage() {
        val message = roomsRepository.createMessage(
            botSpamRepository.botName,
            CreateMessage(botSpamRepository.roomName, botSpamRepository.getPhrase())
        )

        connectionsRepository.sendToAll(
            WsResponse(
                message.room,
                message.text,
                null,
                message.created,
                message.sender,
            )
        )
    }
}