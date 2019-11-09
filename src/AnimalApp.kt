fun main() {
    println("mulai program")
    val animal = arrayOf(Hippo(), Wolf())
    for (item in animal) {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roomables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roomables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }
}