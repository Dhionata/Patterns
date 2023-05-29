package jv.abstractFactory.Estados;

import jv.abstractFactory.Ingredientes.*;
import jv.abstractFactory.XtudoTipos.XtudoIngredientesFactory;

public class MgHamburgaria extends XtudoIngredientesFactory {
    @Override
    public Pao criarPao() {
        return new PaoFrances();
    }

    @Override
    public Hamburguer criarAmburguer() {
        return new HamburguerDeCarne();
    }

    @Override
    public Maionese criarMaionese() {
        return new MaioneseCaseira();
    }
}
