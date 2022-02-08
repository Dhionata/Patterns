package bridge

open class Forma {
    private var cor: Cor? = null
    fun defineCor(nome: String) {
        cor = if (nome == "vermelho") {
            Vermelho()
        } else {
            Azul()
        }
    }

    fun imprimirCodigoCor() {
        (cor ?: return).imprimirCodigoCor()
    }
}