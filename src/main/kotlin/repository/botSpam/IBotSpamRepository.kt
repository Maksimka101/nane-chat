package repository.botSpam

interface IBotSpamRepository {
    val botName: String
    val roomName: String
    fun getPhrase(): String
}