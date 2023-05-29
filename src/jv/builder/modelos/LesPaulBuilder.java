package jv.builder.modelos;

import jv.builder.GuitarraBuilder;

public class LesPaulBuilder extends GuitarraBuilder {
    @Override
    public void buildCaptadores() {
        guitarra.setCaptadores("Humbucker");
    }

    @Override
    public void buildMadeira() {
        guitarra.setMadeira("Mogno");
    }

    @Override
    public void buildModelo() {
        guitarra.setModelo("LesPaul");
    }

    @Override
    public void buildPonte() {
        guitarra.setPonte("Fixa");
    }

    @Override
    public void buildAfinacao() {
        guitarra.setAfinacao("1/2 Tom");
    }

    @Override
    public void buildAnoFabricacao() {
        guitarra.setAnoFabricacao(1952);
    }

}
