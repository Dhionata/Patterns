package composite

abstract class Produto {
    open val nome: String = ""
    open var preco: Float = 0F

    fun calcularPreco(p: Produto) {
        preco += when (p.nome) {
            "Trufa" -> {
                5F
            }
            "Barra" -> {
                10F
            }
            "Cesta" -> {
                20F
            }
            else -> {
                0F
            }
        }
    }
}
