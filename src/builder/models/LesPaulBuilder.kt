package builder.models

import builder.GuitarBuilder
/*
Created by Dhionatã on 2/7/2022
*/
class LesPaulBuilder() : GuitarBuilder() {
    override fun buildpPickups() {
        guitar.pickups = "Hambucker"
    }

    override fun buildBody() {
        guitar.body = "Les Paul"
    }

    override fun buildBridge() {
        guitar.bridge = "Mogno"
    }

    override fun buildDate() {
        guitar.date = "2020"
    }
}