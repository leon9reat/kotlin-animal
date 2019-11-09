open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise() {
        println("the animal is making a noise")
    }

    open fun eat() {
        println("the animal is eating")
    }

    open fun roam() {
        println("the animal is roaming")
    }

    fun sleep() {
        println("the animal is sleeping")
    }
}

open class Canine : Animal() {
    override fun roam() {
        println("the canine is roaming")
    }
}