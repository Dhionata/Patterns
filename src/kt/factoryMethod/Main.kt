package kt.factoryMethod

import kt.factoryMethod.contracts.AbstractFactory
import kt.factoryMethod.contracts.HtmlFactory
import kt.factoryMethod.contracts.WindowsFactory

/*
Created by Dhionatã on 2/8/2022
*/
private lateinit var abstractFactory: AbstractFactory

fun main() {
    decision()
    factoryMethod()
}

fun decision() {
    abstractFactory = if (System.getProperty("os.name").equals("Windows 10")) {
        WindowsFactory()
    } else {
        HtmlFactory()
    }
}

fun factoryMethod() {
    abstractFactory.renderPainel()
}