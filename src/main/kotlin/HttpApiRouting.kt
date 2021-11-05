import io.ktor.application.*
import io.ktor.routing.*

fun Application.routeApi() {
    routing {
        route("/api") {
            routeRooms()
        }
    }
}