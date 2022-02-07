package adapter

import java.util.*

object Cliente {
    @JvmStatic
    fun main(args: Array<String>) {
        val produtosPP = LinkedList<ProdutoPP>()
        val prod = ProdutoXPTO()
        val prod2 = ProdutoXYZ()
        prod.codXPTO = "123456789"
        prod2.codXYZ = "XYZ-9999"
        val adaptador = AdaptadorProdutoXPTO(prod)
        val adaptadorXYZ = AdaptadorProdutoXYZ(prod2)
        val prodPP = ProdutoPP()
        prodPP.codPP = adaptador.codigo
        produtosPP.add(prodPP)
        val prodPP2 = ProdutoPP()
        prodPP2.codPP = adaptadorXYZ.codigo
        println("Codigo XPTO: " + prod.codXPTO + "\nCodigo convertido: " + adaptador.codigo + "\n")
        println("Codigo XYZ: " + prod2.codXYZ + "\nCodigo convertido: " + adaptadorXYZ.codigo + "\n")
    }
}

