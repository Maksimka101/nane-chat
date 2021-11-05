import services.botService.BotSpamService
import injection.appModule
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.serialization.*
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.websocket.*
import kotlinx.coroutines.launch
import org.koin.ktor.ext.Koin
import org.koin.ktor.ext.inject
import repository.botSpam.KozmaBotSpamRepository
import repository.connection.IConnectionsRepository
import repository.room.IRoomsRepository
import route.ws.wsRoute

fun main(args: List<String>) {
    val enableKozmaBot = args.contains("-kozma")

    embeddedServer(Netty, port = 8080, host = "127.0.0.1", configure = {}) {
        install(ContentNegotiation) {
            json()
        }
        install(Koin) {
            modules(appModule)
        }
        install(WebSockets)

        routeApi()
        wsRoute()

        if (enableKozmaBot) {
            launch {
                BotSpamService(
                    KozmaBotSpamRepository(),
                    inject<IConnectionsRepository>().value,
                    inject<IRoomsRepository>().value
                ).startSpamming()
            }
        }
    }.start(wait = true)
}