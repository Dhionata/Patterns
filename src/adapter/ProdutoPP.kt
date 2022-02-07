package adapter

open class ProdutoPP(var codPP: String? = null) {

    fun construirCodigo(codNumerico: String): String {
        return "PP$codNumerico"
    }
}