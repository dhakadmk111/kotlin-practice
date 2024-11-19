fun main() {
    var fn: (a: Int, b: Int) -> Int = ::sum
    val lambda1 = { x: Int, y: Int -> x + y }

}
fun sum(a: Int, b: Int): Int = a+b

fun calculator(a: Int,b: Int, op: (Int,Int) -> Int): Int {
    return op(a, b)
}