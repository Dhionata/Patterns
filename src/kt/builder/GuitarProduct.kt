package kt.builder

//abstract fun buildpPickups()
//    abstract fun buildBody()
//    abstract fun buildBridge()
//    abstract fun buildDate()
class GuitarProduct {
    lateinit var pickups: String
    lateinit var body: String
    lateinit var bridge: String
    lateinit var date: String

    fun show() {
        println("\n-- Guitar --")
        println("Pickups: $pickups")
        println("Body: $body")
        println("Bridge: $bridge")
        println("Date: $date")
    }
}
