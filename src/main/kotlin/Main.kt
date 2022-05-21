fun main() {
    val audio = Audio(1,"artist","song",344)

    val post = Post(1,2,"",5)
    val post1 = Post(4,2,"",5, arrayListOf(attachmentAudio(audio)))
    println(WallService.add(post))
    println(WallService.add(post1))
}