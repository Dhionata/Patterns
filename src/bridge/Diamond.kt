package bridge

class Diamond : Categoria() {
    override fun acionarBeneficio(idBeneficio: Int) {
        println("Beneficio: " + super.beneficios[idBeneficio])
        when (idBeneficio) {
            0 -> {
                println("Gerando o cafezinho...")
            }
            1 -> {
                println("Calculando os 15% de desconto...")
            }
            2 -> {
                println("Viagem emitida para Caldas Novas!")
            }
            3 -> {
                println("Viagem para Cancum emitida!")
            }
        }
    }

    init {
        super.addBeneficio("Cafezinho")
        super.addBeneficio("Desconto 15% na recompra")
        super.addBeneficio("Viagem para Caldas Novas")
        super.addBeneficio("Viagem para Cancum")
    }
}