fun main(){

    val nums:List<Int> = listOf(1,2,3,4,5)

    nums.forEach { println(it) }
}

data class User(val id: Int, val name: String)

data class PaidUser(val id: Int, val name: String, val type: String)

