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

data class attachmentAudio (
    override val type: Audio
        ) : Attachment

data class attachmentVideo (
    override val type: Video
) : Attachment

data class attachmentPhoto (
    override val type: Photo
) : Attachment

data class attachmentLink (
    override val type: Link
) : Attachment

data class attachmentNote (
    override val type: Note
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



