package jv.builder.modelos;

import jv.builder.GuitarraBuilder;

public class IcemanBuilder extends GuitarraBuilder {
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
        guitarra.setModelo("Iceman");
    }

    @Override
    public void buildPonte() {
        guitarra.setPonte("Flutuante");
    }

    @Override
    public void buildAfinacao() {
        guitarra.setAfinacao("1 Tom abaixo");
    }

    @Override
    public void buildAnoFabricacao() {
        guitarra.setAnoFabricacao(1975);
    }
}
