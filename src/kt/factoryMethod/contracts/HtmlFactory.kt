package kt.factoryMethod.contracts

import kt.factoryMethod.buttons.HtmlButton

/*
Created by Dhionatã on 2/8/2022
*/
class HtmlFactory : AbstractFactory() {
    override fun createButton(): HtmlButton {
        return HtmlButton()
    }
}