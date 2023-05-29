package jv.abstractFactory.XtudoTipos;

import jv.abstractFactory.Ingredientes.Hamburguer;
import jv.abstractFactory.Ingredientes.Maionese;
import jv.abstractFactory.Ingredientes.Pao;

public class XtudoBasico extends Xtudo {

    private final XtudoIngredientesFactory ingredientes;

    public XtudoBasico(XtudoIngredientesFactory ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void prepararBasico() {
        Pao pao = ingredientes.criarPao();
        Hamburguer hamburguer = ingredientes.criarAmburguer();
        Maionese maionese = ingredientes.criarMaionese();
    }
}
