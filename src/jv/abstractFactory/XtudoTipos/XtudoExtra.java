package jv.abstractFactory.XtudoTipos;

import jv.abstractFactory.Ingredientes.Hamburguer;
import jv.abstractFactory.Ingredientes.Maionese;
import jv.abstractFactory.Ingredientes.Pao;

public class XtudoExtra extends Xtudo {

    private final XtudoIngredientesFactory ingredientes;

    public XtudoExtra(XtudoIngredientesFactory ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void prepararExtra() {
        Pao pao = ingredientes.criarPao();
        Hamburguer hamburguer = ingredientes.criarAmburguer();
        Maionese maionese = ingredientes.criarMaionese();
    }
}
