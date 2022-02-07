package composite

object Cliente {
    @JvmStatic
    fun main(args: Array<String>) {
        val cesta = Cesta()
        cesta.addProduto(Trufa())
        cesta.addProduto(Barra())
        val produtos = arrayListOf<Produto>()
        produtos.add(cesta)
        produtos.add(Trufa())
        produtos.add(Barra())

        println("Produtos na cesta.")
        produtos.forEach {
            println(it.nome)
        }
        println("Total: R$ ${cesta.preco}")
    }
}
