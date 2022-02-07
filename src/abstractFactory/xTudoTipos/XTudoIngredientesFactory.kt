package abstractFactory.xTudoTipos

import abstractFactory.ingredientes.*

/*
Created by Dhionatã on 05/02/2022
*/

abstract class XTudoIngredientesFactory {
    abstract fun criarPao(): Pao
    abstract fun criarHamburguer(): Hamburguer
    abstract fun criarMaionese(): Maionese
}