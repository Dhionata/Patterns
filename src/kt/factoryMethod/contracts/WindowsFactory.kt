package kt.factoryMethod.contracts

import kt.factoryMethod.buttons.WindowsButton

/*
Created by Dhionatã on 2/8/2022
*/
class WindowsFactory : AbstractFactory() {
    override fun createButton(): WindowsButton {
        return WindowsButton()
    }
}