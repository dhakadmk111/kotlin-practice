fun main(){
   /* val nums = mutableListOf(1,2,3)
    println(nums.indexOf(3))
    println(nums.contains(4))
    nums[1]= 2
    nums.add(5)
    nums.remove(1)
    println(nums)

    val list2 = listOf(11,12)
    nums.addAll(list2)
    println(nums) */

    val  students = mutableMapOf<Int, String>()
    students.put(1, "ryan")
    students.put(2, "john")
    students.put(3, "katis")

    println(students.get(1))
    println(students.get(11))

    for((key,value) in students){
        println("$key = $value")
    }

    students[8] = "john"
    println(students[8])

    val map = mapOf<Int,String>(1 to "hello" , 2 to "mayank")
    println(map)


}