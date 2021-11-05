package model

import kotlinx.serialization.Serializable
import java.time.LocalDateTime

@Serializable
data class Message(
    val room: String,
    @Serializable(with = DateSerializer::class) val created: LocalDateTime,
    val sender: User,
    val text: String,
)

@Serializable
data class CreateMessage(val room: String, val text: String, val id: String? = null)
