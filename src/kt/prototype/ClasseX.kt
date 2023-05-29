package kt.prototype

class ClasseX {
    var nome: String? = null

    @Override
    fun equals(obj: ClasseX): Boolean = obj.nome == nome

}