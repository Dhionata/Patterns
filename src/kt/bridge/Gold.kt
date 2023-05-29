package kt.bridge

class Gold : Categoria() {
    override fun acionarBeneficio(idBeneficio: Int) {
        println("Beneficio: " + super.beneficios[idBeneficio])
        if (idBeneficio == 0) {
            println("Gerando o cafezinho...")
        } else if (idBeneficio == 1) {
            println("Calculando os 5% de desconto...")
        }
    }

    init {
        super.addBeneficio("Cafezinho")
        super.addBeneficio("Desconto 5% na recompra")
    }
}
