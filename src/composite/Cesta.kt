package composite

import java.util.*

class Cesta : Produto() {
    override val nome = "Cesta"
    override var preco: Float = 0F
    private val listaProd = LinkedList<Produto>()

    fun addProduto(p: Produto) {
        listaProd.add(p)
        calcularPreco(p)
    }

}