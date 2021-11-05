package injection

import org.koin.dsl.module
import repository.botSpam.IBotSpamRepository
import repository.botSpam.KozmaBotSpamRepository
import repository.connection.ConnectionsRepository
import repository.connection.IConnectionsRepository
import repository.message.IMessagesRepository
import repository.message.MessagesRepository
import repository.room.IRoomsRepository
import repository.room.RoomsRepository

val appModule = module {
    val messagesRepository = MessagesRepository()
    single<IMessagesRepository> { messagesRepository }
    single<IRoomsRepository> { RoomsRepository(messagesRepository) }
    single<IConnectionsRepository> { ConnectionsRepository() }
}