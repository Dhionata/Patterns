package kt.abstractFactory

import kt.abstractFactory.estados.GoHamburgaria
import kt.abstractFactory.estados.MgHamburgaria
import kt.abstractFactory.xTudoTipos.XTudoBasico
import kt.abstractFactory.xTudoTipos.XTudoCompleto
import kt.abstractFactory.xTudoTipos.XTudoExtra
import kt.abstractFactory.xTudoTipos.XTudoIngredientesFactory

/*
Created by Dhionatã on 05/02/2022
*/
class Hamburgaria {

    fun criarHamburguer(cidade: String, tipo: String?) {
        val xtudo = when (tipo) {
            "completo" -> XTudoCompleto(getIngredientes(cidade))
            "básico" -> XTudoBasico(getIngredientes(cidade))
            "extra" -> XTudoExtra(getIngredientes(cidade))
            else -> {
                println("Tipo de hamburguer não encontrado")
                return
            }
        }
        xtudo.preparar()
        println("\n\n-- Hamburguer--\n\n")
        xtudo.exibir()
    }

    private fun getIngredientes(c: String): XTudoIngredientesFactory {
        return when (c) {
            "minas" -> {
                MgHamburgaria()
            }

            "goias" -> {
                GoHamburgaria()
            }

            else -> {
                MgHamburgaria()
            }
        }
    }
}