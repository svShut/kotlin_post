import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class WallServiceTest {

    private val service = WallService
    private var postId = 1



    @Test
    fun add_Post_audio_video() {
        val fromId = 1
        val text = "audio and video"
        val audio = Audio(1,"artist","song",344)
        val video = Video(2,"video","",344)

        val post = service.add(
            Post(
                id = postId,
                text = text,
                attachments = arrayListOf(attachmentAudio(audio), attachmentVideo(video))
            )
        )
    }

    @Test
    fun update_add_audio() {
        val fromId = 2
        val text = "text"

        val audio1 = Audio(1,"Alestorm","Alestorm",345,true)

        service.add(Post(postId, 345, "text"))

        val post = service.update(
            Post(
                id = postId,
                text = text,
                attachments = arrayListOf(attachmentAudio(audio1))
            )
        )
    }
}