package abstractFactory.estados

import abstractFactory.ingredientes.Hamburguer
import abstractFactory.ingredientes.Maionese
import abstractFactory.ingredientes.Pao
import abstractFactory.xTudoTipos.XTudoIngredientesFactory
import abstractFactory.xTudoTipos.XTudo as XTudo1

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