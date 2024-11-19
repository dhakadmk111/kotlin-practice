fun main(){
    val obA = A()
    val obB = B()
}
open class A{
    public var p = 10
    internal var q = 20
    private var r = 30
    protected var s = 40
}
class B:A(){
      fun test() {
          println(p)
          println(q)
          //println(r)
          println(s)
      }
}

