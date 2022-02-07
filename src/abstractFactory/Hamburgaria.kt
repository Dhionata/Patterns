package abstractFactory

import abstractFactory.estados.GoHamburgaria
import abstractFactory.estados.MgHamburgaria
import abstractFactory.xTudoTipos.XTudoBasico
import abstractFactory.xTudoTipos.XTudoCompleto
import abstractFactory.xTudoTipos.XTudoExtra
import abstractFactory.xTudoTipos.XTudoIngredientesFactory

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
        return if (c == "minas") {
            MgHamburgaria()
        } else if (c == "goias") {
            GoHamburgaria()
        } else {
            MgHamburgaria()
        }
    }
}