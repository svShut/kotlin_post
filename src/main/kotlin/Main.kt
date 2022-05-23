fun main() {
    val audio = Audio(1,"artist","song",344)
    val comment = Comment(2,1,234,"text")

    val post = Post(1,2,"",5)
    val post1 = Post(4,2,"",5, arrayListOf(AudioAttachment("audio", audio)))
    println(WallService.add(post))
    println(WallService.add(post1))

    WallService.createComment(comment)

}