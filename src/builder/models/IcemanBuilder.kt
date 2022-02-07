package builder.models

import builder.GuitarBuilder

/*
Created by Dhionatã on 2/7/2022
*/
class IcemanBuilder : GuitarBuilder() {
    override fun buildpPickups() {
        guitar.pickups = "Humbucker"
    }

    override fun buildBody() {
        guitar.body = "Iceman"
    }

    override fun buildBridge() {
        guitar.bridge = "Mogno"
    }

    override fun buildDate() {
        guitar.date = "2022"
    }
}