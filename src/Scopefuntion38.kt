fun main(){
    val emp = Employee()
    emp.age = 20
    emp.name = "john"

   println(emp.age)
   println(emp.name)

    emp.let {
       println(it.name)
       println(it.age)

   }
    with(emp){
        age=30
        name= "xyz"
    }

    emp.run{
        age= 28
        name= "hgsdd"
    }
}

data class Employee(var name:String = "", var age: Int = 18)

