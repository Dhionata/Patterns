package kt.bridge

class Basic : Categoria() {
    override fun acionarBeneficio(idBeneficio: Int) {
        println("Beneficio: " + super.beneficios[idBeneficio])
        if (idBeneficio == 0) {
            println("Gerando o cafezinho...")
        }
    }

    init {
        super.addBeneficio("Cafezinho")
    }
}