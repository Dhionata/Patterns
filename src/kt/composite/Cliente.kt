package kt.composite

fun main() {
    val cesta = Cesta()
    cesta.addProduto(Trufa())
    cesta.addProduto(Barra())
    val produtos = arrayOfNulls<Produto>(5)
    produtos[0] = cesta
    produtos[1] = Trufa()
    produtos[2] = Barra()

    println("Produtos na cesta.")
    produtos.forEach {
        println(it)
    }
}


