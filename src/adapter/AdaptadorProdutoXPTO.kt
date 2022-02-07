package adapter

class AdaptadorProdutoXPTO(private val produto: ProdutoXPTO) : ProdutoPP() {

    val codigo: String
        get() {
            val codPP = super.construirCodigo(produto.codXPTO)
            super.codPP = codPP
            return codPP
        }
}