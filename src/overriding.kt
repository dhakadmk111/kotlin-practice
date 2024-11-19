fun main(){
     val OnePlus = OnePlus(typeParam = "Smart Phone")
     OnePlus.dislay()
     println(OnePlus.toString())


}

open class Mobile(val type:String){
    open val name:String = ""
    open val size:Int = 5

    fun makeCall() = println("Calling from Mobile")
    fun powerOff() = println("Shutting down")
    open fun dislay() = println("Simple mobile display")

}

class OnePlus(typeParam:String) : Mobile(typeParam) {
    override val name: String = "One Plus"
    override val size: Int = 6
    override fun dislay() {
          super.dislay()
          println("One Plus Display")

    }

    override fun toString(): String {
        return "OnePlus(name='$name', size=$size)"
    }

}
// intelij se insert krwane ke liye alt+insert