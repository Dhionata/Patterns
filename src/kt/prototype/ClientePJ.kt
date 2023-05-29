package kt.prototype

class ClientePJ : Cliente {
    var cnpj: String? = null

    constructor()
    constructor(objMatriz: ClientePJ?) : super(objMatriz) {
        if (objMatriz != null) {
            cnpj = objMatriz.cnpj
        }
    }

    override fun clonar(): Cliente {
        return ClientePJ(this)
    }

    fun equals(cliente: ClientePJ): Boolean {
        return super.equals(cliente) && cnpj == cliente.cnpj
    }

    fun imprimir() {
        println(super.toString() + "\nCNPJ : $cnpj\n")
    }
}