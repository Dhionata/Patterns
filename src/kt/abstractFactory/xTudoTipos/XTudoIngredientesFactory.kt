package kt.abstractFactory.xTudoTipos

import kt.abstractFactory.ingredientes.Hamburguer
import kt.abstractFactory.ingredientes.Maionese
import kt.abstractFactory.ingredientes.Pao

/*
Created by Dhionatã on 05/02/2022
*/

abstract class XTudoIngredientesFactory {
    abstract fun criarPao(): Pao
    abstract fun criarHamburguer(): Hamburguer
    abstract fun criarMaionese(): Maionese
}