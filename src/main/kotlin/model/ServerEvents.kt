import kotlinx.serialization.Serializable
import model.DateSerializer
import model.User
import java.time.LocalDateTime
import java.util.*

@Serializable
class WsRequest(val room: String, val text: String, val id: String? = null)

@Serializable
class WsResponse(
    val room: String,
    val text: String,
    val id: String? = null,
    @Serializable(with = DateSerializer::class) val created: LocalDateTime,
    val sender: User,
)

@Serializable
class HttpResponse<T>(val result: T? = null, val error: HttpErrorResponse? = null)

@Serializable
class HttpErrorResponse
