package jv.abstractFactory.Estados;

import jv.abstractFactory.Ingredientes.*;
import jv.abstractFactory.XtudoTipos.XtudoIngredientesFactory;


public class GoHamburgaria extends XtudoIngredientesFactory {
    @Override
    public Pao criarPao() {
        return new PaoFino();
    }

    @Override
    public Hamburguer criarAmburguer() {
        return new HamburguerVegetariano();
    }

    @Override
    public Maionese criarMaionese() {
        return new MaionesePura();
    }
}
