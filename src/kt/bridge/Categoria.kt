package kt.bridge

import java.util.*

abstract class Categoria {
    private var id = 0
    private var descricao: String? = null
    private var taxaDesconto = 0f
    var beneficios: LinkedList<String> = LinkedList()


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

}