package jv.factoryMethod.contratos;


import jv.factoryMethod.botoes.Botao;
import jv.factoryMethod.botoes.BotaoHtml;

public class FabricaHtml extends FabricaAbstrata {

    @Override
    public Botao criarBotao() {
        return new BotaoHtml();
    }
}
