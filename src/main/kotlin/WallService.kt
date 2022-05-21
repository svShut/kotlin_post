object  WallService {

    private var posts = HashMap<Int?, Post?>()
    private var postId = 1


    fun add(post: Post): Post {
        val newPost = post.copy(id = postId)
        posts[postId++] = newPost
        return newPost
    }


    fun update(post: Post): Boolean {
        val newPost = posts[post.id]?.copy(text = post.text, likes = post.likes, attachments = post.attachments) ?: return false
        posts[post.id] = newPost
        return true
    }
}