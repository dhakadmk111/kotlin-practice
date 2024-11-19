fun main(){

    val p1 = human(1,"john")
    val p2 = human(1,"john")

    val p3:human = p1.copy()
    println(p3)

    val (id:Int , name:String) = p1
    println(id)
    println(name)
    println(p1.component1())

}

data class human(val id: Int , val name: String)
{

}