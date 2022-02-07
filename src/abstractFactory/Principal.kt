package abstractFactory

/* Created by Dhionatã on 05/02/2022 */
class Principal {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val h1 = Hamburgaria()
            val h2 = Hamburgaria()
            val h3 = Hamburgaria()
            h1.criarHamburguer("minas", "completo")
            h2.criarHamburguer("goias", "extra")
            h3.criarHamburguer("goias", "básico")
        }
    }
}