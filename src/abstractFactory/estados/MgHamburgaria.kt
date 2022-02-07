package abstractFactory.estados

import abstractFactory.ingredientes.Hamburguer
import abstractFactory.ingredientes.Maionese
import abstractFactory.ingredientes.Pao
import abstractFactory.xTudoTipos.XTudoIngredientesFactory

/*
Created by Dhionatã on 05/02/2022
*/
class MgHamburgaria : XTudoIngredientesFactory() {
    override fun criarPao(): Pao {
        return Pao.FRANCES
    }

    override fun criarHamburguer(): Hamburguer {
        return Hamburguer.FRANGO
    }

    override fun criarMaionese(): Maionese {
        return Maionese.CASEIRA
    }
}