fun main() {
    /* var testObj = object{
        val x : Int = 10
        fun method(){
            println("i am a object expression")

        }
    }
    println(testObj.method()) */
  var obj2 = object : person(name= "cheezycode"){
      override fun fullName() {
          super.fullName()
          println("anonymous - $name")
      }
  }
    obj2.fullName()
}
interface cloneable{
    fun clone()
}
open class person(val name:String){
    open fun fullName() = println("Full Name - $name")
}
