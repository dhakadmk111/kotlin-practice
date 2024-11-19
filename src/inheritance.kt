fun main(){

    val objChlid = Chlid()
    objChlid.myMethod()
    objChlid.myMethod2()
}

open class parent(){

    val name : String = ""

    fun myMethod(){
        println("I am in parent")
    }
}
class Chlid : parent()
{
    val name2 : String = ""

    fun myMethod2(){
        println("Im in child")
    }
}