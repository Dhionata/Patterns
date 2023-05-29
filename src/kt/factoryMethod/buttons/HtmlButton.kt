package kt.factoryMethod.buttons

/*
Created by Dhionatã on 2/8/2022
*/
class HtmlButton : Button {
    override fun render() {
        println("<button>Testar Botão</button>")
    }

    override fun onClick() {
        println("Botão clicado!")
    }
}
