fun main(){
    val obj = Outer()
    obj.i

    //val nested = Outer.Nasted()
    //nested.test()

    val inner:Outer.Nested = Outer().Nested()
    inner.test()

}

class Outer{
    var i = 0

    inner class Nested{
        fun test(){
            println("I am nested class")
        }
    }
}