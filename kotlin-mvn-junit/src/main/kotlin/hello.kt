fun hello(greeted: String): String = "Hello " + greeted

class Hello(val greeted: String) {
    fun hello() = "Hello " + greeted
}