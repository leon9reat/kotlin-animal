class Hippo : Animal() {
    override val image: String
        get() = "hippo.jpg"
    override val food: String
        get() = "grass"
    override val habitat: String
        get() = "water"

    override fun makeNoise() {
        println("grunt! grunt!")
    }

    override fun eat() {
        println("the hippo is eating $food")
    }
}