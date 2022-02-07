package prototype

class ClasseX {
    var nome: String? = null

    @Override
    fun equals(obj: ClasseX): Boolean {
        return obj.nome == nome
    }
}