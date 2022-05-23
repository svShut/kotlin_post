import java.util.*
import kotlin.collections.ArrayList

data class Post(
    val id: Int,
    val date: Long = Date().time,
    val text: String? = null,
    val likes: Int = 0,
    val attachments: ArrayList<Attachment> = ArrayList()
)

data class Audio (
    val id: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val isHq: Boolean = false
        )

data class AudioAttachment (
    override val type: String = "audio",
    val audio: Audio

        ) : Attachment

data class VideoAttachment (
    override val type: String = "video",
    val video: Video
) : Attachment

data class PhotoAttachment (
    override val type: String = "photo",
    val photo: Photo
) : Attachment

data class LinkAttachment (
    override val type: String = "link",
    val link: Link
) : Attachment

data class NoteAttachment (
    override val type: String = "note",
    val note: Note
) : Attachment


data class Link (
    val url: String,
    val title: String,
    val description: String? = null,
        )

data class Note (
    val id: Int,
    val title: String,
    val text: String? = null,
    val comments: Int?
        )

data class Photo (
    val id: Int,
    val text: String? = null,
    val width: Int,
    val height: Int
        )

data class Video (
    val id: Int,
    val title: String,
    val description: String? = null,
    val duration: Int,
    val views: Int = 0
        )

data class Comment(
    val id: Int,
    val fromId: Int,
    val date: Long,
    val text: String?
)



