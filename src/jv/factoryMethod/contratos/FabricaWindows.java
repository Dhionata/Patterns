package jv.factoryMethod.contratos;

import jv.factoryMethod.botoes.Botao;
import jv.factoryMethod.botoes.BotaoWindows;

public class FabricaWindows extends FabricaAbstrata {

    @Override
    public Botao criarBotao() {
        return new BotaoWindows();
    }
}