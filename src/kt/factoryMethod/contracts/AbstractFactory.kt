package kt.factoryMethod.contracts

import kt.factoryMethod.buttons.Button

/*
Created by Dhionatã on 2/8/2022
*/
abstract class AbstractFactory {

    fun renderPainel() {
        val button = createButton()
        button.render()
    }

    abstract fun createButton(): Button
}