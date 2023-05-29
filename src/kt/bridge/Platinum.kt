package kt.bridge

class Platinum : Categoria() {
    override fun acionarBeneficio(idBeneficio: Int) {
        println("Beneficio: " + super.beneficios[idBeneficio])
        when (idBeneficio) {
            0 -> {
                println("Gerando o cafezinho...")
            }

            1 -> {
                println("Calculando os 10% de desconto...")
            }

            2 -> {
                println("Viagem emitida para Caldas Novas!")
            }
        }
    }

    init {
        super.addBeneficio("Cafezinho")
        super.addBeneficio("Desconto 10% na recompra")
        super.addBeneficio("Viagem para Caldas Novas")
    }
}