fun main(){
    val circle = circle(4.0)
    println(circle.toString())
}

open class shape{
    open fun area() :Double = 0.0
    override fun toString(): String {
        return "I am shape"

    }
    }


class circle(val radius:Double): shape(){
    override fun area(): Double{
        return Math.PI *  radius * radius
    }
}