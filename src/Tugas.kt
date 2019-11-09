interface Flayable {
    val x: String
    fun fly() {
        println("$x is flying")
    }
}

class Bird : Flayable {
    override val x: String
        get() = "Bird"

}

class Plane : Flayable {
    override val x: String
        get() = "Plane"

}

class Superhero : Flayable {
    override val x: String
        get() = "Superhero"

}

fun main() {
    val f = arrayOf(Bird(), Plane(), Superhero())
    var x = 0
    while (x in 0..2) {
        val y = when (f[x]) {
            is Bird -> false
            else -> true
        }
        if (y) f[x].fly()
        x++
    }
}