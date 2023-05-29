package kt.builder

import kt.builder.models.IcemanBuilder
import kt.builder.models.LesPaulBuilder
import kt.builder.models.StratocasterBuilder

/*
Created by Dhionatã on 2/7/2022
*/
fun main() {
    //Objeto/Produto Guitarra
    var guitarra: GuitarProduct
    //classe responsável por chamar a classe de produção (no caso do exemplo do prof. PPDirector)
    //o produto é inserido dentro da variável guitarra
    var diretorDeProducao = ProductDirector(LesPaulBuilder())
    guitarra = diretorDeProducao.getGuitar()

    guitarra.show()
    //inpressão do objeto (n tem parte gráfica kk)

    //processo se repete para a produção das outras guitarras
    diretorDeProducao = ProductDirector(IcemanBuilder())
    guitarra = diretorDeProducao.getGuitar()

    guitarra.show()

    diretorDeProducao = ProductDirector(StratocasterBuilder())
    guitarra = diretorDeProducao.getGuitar()

    guitarra.show()
}

