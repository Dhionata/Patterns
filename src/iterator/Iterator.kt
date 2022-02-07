package iterator

import java.util.*

fun main() {
    val l: LinkedList<Int> = LinkedList<Int>()

    repeat(10) { ui ->
        l.add(ui)
    }

    val it2 = l.listIterator()

    println("oi, aqui começa sua contagem...")
    do {
        println("Deseja avançar ou voltar?\n1 - Avançar\n2 - Voltar")
        when (readLine()?.toInt()) {
            1 -> {
                println("Reconheceu o equals.1")
                if (it2.hasNext()) {
                    print("Entrou no hasNext()")
                    println("\n\n${it2.next()}\n\n")

                }
            }
            2 -> {
                println("Reconheceu o equals.2")
                if (it2.hasPrevious()) {
                    println("Entrou no hasPrevious")
                    println("\n\n${it2.previous()}\n\n")
                } else {
                    println("Não tem nada antes...")
                }
            }
            else -> {
                println("Número não reconhecido...")
            }
        }
    } while (it2.hasNext())
}