fun main() {
     val ob = Calculator()
     println(ob.added( a=2,b=3))
}
 class Calculator {

     lateinit var message:String


     fun added(a: Int, b: Int): Int {
         return a + b
     }

     fun multiply(a: Int, b: Int): Int {
         return a * b
     }
 }





