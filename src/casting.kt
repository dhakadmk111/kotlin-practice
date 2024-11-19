/*fun main() {
    val circle = circle(radius = 4.0)
    val player = player

    if (circle is circle) {
        println("this is circle")
    }

    interface Dragable {
        fun drag()
    }

    abstract class Shape : Dragable {
        abstract fun area(): Double
    }

    class circle(val radius: Double) : Shape() {
        override fun area(): Double = Math.PI * radius * radius
        override fun drag() = println("circle is dragging")
    }

    class player(val name: String) : Shape() {
        override fun drag() = println("$name is dragging")
        fun sayMyName() = ("Hey my name is $name")
    }
}
*/