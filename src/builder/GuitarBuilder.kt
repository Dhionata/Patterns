package builder

/*
Created by Dhionatã on 2/7/2022
*/
abstract class GuitarBuilder {
    val guitar: GuitarProduct = GuitarProduct()

    abstract fun buildpPickups()
    abstract fun buildBody()
    abstract fun buildBridge()
    abstract fun buildDate()
}