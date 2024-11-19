fun main(){
    //MyClass.MyObject.f()
    MyClass.f()

}
class MyClass() {
   companion object MyObject {
        fun f() {
            println("I am f from object")
        }
    }
}