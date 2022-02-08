package prototype

object Principal {
    @JvmStatic
    fun main(args: Array<String>) {

        val obj1 = ClasseX()

        obj1.nome = "objeto"

        println(obj1.nome)

        obj1.nome = "novo objeto"

        println(obj1.nome)

        if (obj1 == obj1) {
            println("são iguais")
        }

        if (obj1.equals(obj1))
            println("são iguais (equals)")

        val obj3 = ClasseX()

        obj3.nome = obj1.nome

        if (obj3.equals(obj1))
            println("obj3 é igual ao obj1")
    }
}