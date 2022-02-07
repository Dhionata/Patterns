package bridge

import java.util.*

abstract class Categoria {
    var id: Int = 0
    var descricao: String = ""
    var taxaDesconto: Float = 0f
    var beneficios: LinkedList<String>

    fun setBeneficio(beneficios: LinkedList<String>) {
        this.beneficios = beneficios
    }

    fun addBeneficio(beneficio: String) {
        beneficios.add(beneficio)
    }

    abstract fun acionarBeneficio(idBeneficio: Int)
    override fun toString(): String {
        return "\n-- Categoria --\n" +
                "id : $id\n" +
                "descrição : $descricao\n" +
                "taxa de desconto : $taxaDesconto\n" +
                "benefícios : $beneficios }"
    }

    init {
        beneficios = LinkedList()
    }
}