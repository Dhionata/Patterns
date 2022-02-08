package factoryMethod.contracts

import factoryMethod.buttons.HtmlButton

/*
Created by Dhionatã on 2/8/2022
*/
class HtmlFactory : AbstractFactory() {
    override fun createButton(): HtmlButton {
        return HtmlButton()
    }
}