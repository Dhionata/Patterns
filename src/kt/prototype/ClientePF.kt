package kt.prototype

class ClientePF : Cliente {
    var cpf: String? = null

    constructor() {}
    constructor(objMatriz: ClientePF?) : super(objMatriz) {
        if (objMatriz != null) {
            cpf = objMatriz.cpf
        }
    }

    override fun clonar(): Cliente {
        return ClientePF(this)
    }

    fun equals(cliente: ClientePF): Boolean {
        return super.equals(cliente) && cpf == cliente.cpf
    }

    fun imprimir() {
        println(super.toString() + "\nCPF : $cpf\n")
    }
}