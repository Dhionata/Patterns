package kt.prototype

import kt.bridge.*

abstract class Cliente {
    var nome: String? = null
    var cod = 0
    private var categoria: Categoria? = null

    constructor() {}
    constructor(clienteMatriz: Cliente?) {
        if (clienteMatriz != null) {
            nome = clienteMatriz.nome
            cod = clienteMatriz.cod
        }
    }

    abstract fun clonar(): Cliente
    fun equals(cliente: Cliente): Boolean {
        return nome == cliente.nome && cod == cliente.cod
    }

    fun addCategoria(id: Int) {
        when (id) {
            1 -> categoria = Gold()
            2 -> categoria = Platinum()
            3 -> categoria = Diamond()
            4 -> categoria = Basic()
            else -> println("Categoria inválida!")
        }
    }

    fun acionarBeneficio(id: Int) {
        categoria?.acionarBeneficio(id)
    }

    override fun toString(): String {
        return "--Cliente--" +
                "\nNome : $nome\n" +
                "Cod : $cod\n" +
                "Categoria : $categoria"
    }
}