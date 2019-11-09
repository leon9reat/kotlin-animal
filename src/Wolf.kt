class Wolf : Canine() {
    override val image: String
        get() = "wolf.jpg"
    override val food: String
        get() = "meat"
    override val habitat: String
        get() = "forest"

    override fun makeNoise() {
        println("hoooowl!")
    }

    override fun eat() {
        println("the wolf is eating $food")
    }
}