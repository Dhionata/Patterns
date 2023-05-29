package jv.factoryMethod.botoes;

public class BotaoHtml implements Botao {

    @Override
    public void renderizar() {
        System.out.println("<button>Testar Botão</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Botão disse:\n— 'Olá Mundo!'");
    }
}
