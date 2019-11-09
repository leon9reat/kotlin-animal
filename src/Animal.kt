abstract class Animal: Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
        println("the animal is roaming")
    }

    fun sleep() {
        println("the animal is sleeping")
    }
}

abstract class Canine : Animal() {
    override fun roam() {
        println("the canine is roaming")
    }
}