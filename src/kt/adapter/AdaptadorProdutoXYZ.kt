package kt.adapter

class AdaptadorProdutoXYZ(private val produto: ProdutoXYZ) : ProdutoPP() {

    val codigo: String
        get() {
            val texto: List<String> = produto.codXYZ.split("-")
            val codPP = super.construirCodigo(texto[1])
            super.codPP = codPP
            return codPP
        }
}