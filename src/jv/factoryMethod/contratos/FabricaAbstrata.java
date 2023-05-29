package jv.factoryMethod.contratos;

import jv.factoryMethod.botoes.Botao;

/* Classe básica de fábrica. Observe que "fábrica"
é apenas uma função para a classe. isto deve ter alguma
lógica de negócios central que precisa que produtos diferentes
sejam criados.*/
public abstract class FabricaAbstrata {

    public void renderizarPainel() {
        Botao botao = criarBotao();
        botao.renderizar();
    }

    /* As subclasses irão sobrescrever este método para criar um botão específico */
    public abstract Botao criarBotao();
}