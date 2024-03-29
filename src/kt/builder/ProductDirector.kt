package kt.builder

/*
Created by Dhionatã on 2/7/2022
*/
class ProductDirector(private val builder: GuitarBuilder) {

    private fun buildGuitar() {
        builder.buildBody()
        builder.buildDate()
        builder.buildpPickups()
        builder.buildBridge()
    }

    fun getGuitar(): GuitarProduct {
        buildGuitar()
        return builder.guitar
    }
}