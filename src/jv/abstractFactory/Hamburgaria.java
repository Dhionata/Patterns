package jv.abstractFactory;

import jv.abstractFactory.Estados.GoHamburgaria;
import jv.abstractFactory.Estados.MgHamburgaria;
import jv.abstractFactory.XtudoTipos.XtudoBasico;
import jv.abstractFactory.XtudoTipos.XtudoCompleto;
import jv.abstractFactory.XtudoTipos.XtudoExtra;
import jv.abstractFactory.XtudoTipos.XtudoIngredientesFactory;

public class Hamburgaria {

    public void criarHamburguer(String cidade, String tipo) {
        switch (tipo) {
            case "completo" -> new XtudoCompleto(getIngredientes(cidade)).preparaCompleto();
            case "básico" -> new XtudoBasico(getIngredientes(cidade)).prepararBasico();
            case "extra" -> new XtudoExtra(getIngredientes(cidade)).prepararExtra();
            default -> throw new IllegalStateException("Unexpected value: " + tipo);
        }
    }

    private XtudoIngredientesFactory getIngredientes(String c) {
        if (c.equals("minas")) {
            return new MgHamburgaria();
        } else if (c.equals("goias")) {
            return new GoHamburgaria();
        }
        return null;
    }
}
