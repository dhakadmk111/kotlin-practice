fun main(){
    val p1 = Person( nameParam = "A" , ageParam = 21)
    println(p1.age)
    p1.age = 23
    p1.age = -18
}

class Person(nameParam:String, ageParam: Int){
    var name:String = nameParam
    var age:Int = ageParam
        set(value) {
            if(value > 0){
                field = value
            }
            else{
                println("Age cant be negative")
            }
        }
}



