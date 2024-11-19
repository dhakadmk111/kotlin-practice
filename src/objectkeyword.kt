fun main(){
    sharingWidgth.incrementTwitterLikes()
    sharingWidgth.incrementTwitterLikes()
    sharingWidgth.incrementTwitterLikes()
    sharingWidgth.incrementFbLikes()
    sharingWidgth.incrementFbLikes()
    sharingWidgth.incrementFbLikes()
    sharingWidgth.incrementFbLikes()
    sharingWidgth.display()


}
object sharingWidgth{
    var twitterLikes = 0
    var fbLikes = 0

    fun incrementTwitterLikes() = twitterLikes++
    fun incrementFbLikes() = fbLikes++
    fun display() = println("Facebook - $fbLikes -- Twitter- $twitterLikes")
}