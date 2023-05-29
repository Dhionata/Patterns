package kt.composite

import java.util.*

class Cesta : Produto() {
    override val nome = "Cesta"
    private val listaProd = LinkedList<Produto>()
    override var preco: Float = 0F

    fun addProduto(p: Produto) {
        listaProd.add(p)
        calcularPreco(p)
    }

}