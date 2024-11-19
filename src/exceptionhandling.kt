fun main(){
    val array:Array<Int> = arrayOf(1,2,3)
    try {
        println(array[5])
    }
    catch (ex : NullPointerException){

    }
    catch (e : Exception){
        println("Please checkn the array index")

    }
    finally{

    }

    println("i will execute no matter what")
}