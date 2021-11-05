package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Room(val name: String, @SerialName("last_message") val lastMessage: Message)
