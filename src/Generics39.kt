fun main() {
    /* val obj = IntContainer(3)
    obj.getValue()
    val iContainer = Container<Int>(3)
    iContainer.getValue()
    val sContainer = Container<String>("hello")
    sContainer.getValue()


}

class Container<T>(var data: T) {
    fun setValue(value: T) {
        data = value
    }

    fun getValue(): T{
       return data

    }
}

class IntContainer(var data: Int) {
    fun setValue(value: Int) {
        data = value
    }

    fun getValue(): Int {
        return data
    }
}

class StringContainer(var data: String){
    fun setValue(value:String){
        data = value
    }
    fun getValue():String{
        return data
    }


}
*/
    add(1,2,3,4,5)
    add(1,1,1,1,1,1,1,1)

}

fun add(vararg values:Int){
    var sum = 0
    for(i:Int in values){
        sum += i
    }
    println(sum)
}
