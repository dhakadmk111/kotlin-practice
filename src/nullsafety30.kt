fun main(){
    var gender : String = "male" // "female", "others"
    var gender2 : String? = null
    var isAdult : Boolean? = true

    if (gender2 != null) {
        gender2.toUpperCase()
    }

   println(gender2?.toUpperCase())

   gender2?.let {
     println("line 1")
     println("line 2 $gender2")
     println("line 3 $it")
   }

    var selectValue : String = gender2 ?: "na"
    var value :String = gender2!!.toUpperCase()



}
