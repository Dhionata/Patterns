package jv.abstractFactory.XtudoTipos;

import jv.abstractFactory.Ingredientes.Hamburguer;
import jv.abstractFactory.Ingredientes.Maionese;
import jv.abstractFactory.Ingredientes.Pao;

public abstract class XtudoIngredientesFactory {

    public abstract Pao criarPao();

    public abstract Hamburguer criarAmburguer();

    public abstract Maionese criarMaionese();
}
