package kt.abstractFactory.estados

import kt.abstractFactory.ingredientes.Hamburguer
import kt.abstractFactory.ingredientes.Maionese
import kt.abstractFactory.ingredientes.Pao
import kt.abstractFactory.xTudoTipos.XTudoIngredientesFactory

/*
Created by Dhionatã on 05/02/2022
*/
class GoHamburgaria : XTudoIngredientesFactory() {
    override fun criarPao(): Pao {
        return Pao.FINO
    }

    override fun criarHamburguer(): Hamburguer {
        return Hamburguer.CARNE
    }

    override fun criarMaionese(): Maionese {
        return Maionese.PURA
    }

}