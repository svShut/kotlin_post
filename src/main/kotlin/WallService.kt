
object WallService {

    private var posts = HashMap<Int?, Post?>()
    private var comments = HashMap<Int?, Comment?>()
    private var postId = 1
    private var commentId = 1
    val PostNotFoundException = java.lang.RuntimeException("no post with id")


    fun add(post: Post): Post {
        val newPost = post.copy(id = postId)
        posts[postId++] = newPost
        return newPost
    }


    fun update(post: Post): Boolean {
        val newPost =
            posts[post.id]?.copy(text = post.text, likes = post.likes, attachments = post.attachments) ?: return false
        posts[post.id] = newPost
        return true
    }

    fun createComment(comment: Comment) {
        val newComment = comment.copy(id = comment.id)

        if (comment.id in posts) {
            comments[commentId++] = newComment
        } else throw PostNotFoundException
    }

}