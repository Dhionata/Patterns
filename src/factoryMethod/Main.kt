package factoryMethod

import factoryMethod.contracts.AbstractFactory
import factoryMethod.contracts.HtmlFactory
import factoryMethod.contracts.WindowsFactory

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