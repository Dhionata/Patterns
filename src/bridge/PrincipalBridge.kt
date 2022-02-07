package bridge

import prototype.ClientePF

fun main() {
    //cadastro
    val c1 = ClientePF()
    val c2 = ClientePF()
    val c3 = ClientePF()

    c1.nome = "Ciclano"
    c1.cpf = "124424"

    c2.nome = "Fulano"
    c2.cpf = "5985981"

    c3.nome = "Beutrano"
    c3.cpf = "603001"

    println("Beneficios para o ${c1.nome}".trimIndent())
    c1.addCategoria(1)
    c1.addCategoria(2)

    println("Beneficios para o ${c2.nome}".trimIndent())
    c2.addCategoria(1)
    c2.addCategoria(2)
    c2.addCategoria(3)

    println("Beneficios para o ${c3.nome}".trimIndent())
    c3.addCategoria(4)

    c1.imprimir()
    c2.imprimir()
    c3.imprimir()
}