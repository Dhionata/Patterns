package kt.builder.models

import kt.builder.GuitarBuilder

/*
Created by Dhionatã on 2/7/2022
*/
class StratocasterBuilder : GuitarBuilder() {
    override fun buildpPickups() {
        guitar.pickups = "Single-Coil"
    }

    override fun buildBody() {
        guitar.body = "Mahogany"
    }

    override fun buildBridge() {
        guitar.bridge = "Ash"
    }

    override fun buildDate() {
        guitar.date = "1999"
    }
}