package kt.abstractFactory.xTudoTipos

import kt.abstractFactory.ingredientes.Hamburguer
import kt.abstractFactory.ingredientes.Maionese
import kt.abstractFactory.ingredientes.Pao

/*
Created by Dhionatã on 05/02/2022
*/
abstract class XTudo(private var ingredientes: XTudoIngredientesFactory) {
    private var pao: Pao? = null
    private var hamburguer: Hamburguer? = null
    private var maionese: Maionese? = null

    fun preparar() {
        pao = ingredientes.criarPao()
        hamburguer = ingredientes.criarHamburguer()
        maionese = ingredientes.criarMaionese()
    }

    fun exibir() {
        println("Pao: $pao")
        println("Hamburguer: $hamburguer")
        println("Maionese: $maionese")
    }
}