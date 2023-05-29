package jv.abstractFactory.XtudoTipos;

import jv.abstractFactory.Ingredientes.Hamburguer;
import jv.abstractFactory.Ingredientes.Maionese;
import jv.abstractFactory.Ingredientes.Pao;

public class XtudoCompleto extends Xtudo {
    private final XtudoIngredientesFactory ingredientes;

    public XtudoCompleto(XtudoIngredientesFactory ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void preparaCompleto() {
        Pao pao = ingredientes.criarPao();
        Hamburguer hamburguer = ingredientes.criarAmburguer();
        Maionese maionese = ingredientes.criarMaionese();
    }
}
