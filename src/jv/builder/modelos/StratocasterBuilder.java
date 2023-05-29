package jv.builder.modelos;

import jv.builder.GuitarraBuilder;

public class StratocasterBuilder extends GuitarraBuilder {
    @Override
    public void buildCaptadores() {
        guitarra.setCaptadores("Single-Coil");
    }

    @Override
    public void buildMadeira() {
        guitarra.setMadeira("Ash");
    }

    @Override
    public void buildModelo() {
        guitarra.setModelo("Stratocaster");
    }

    @Override
    public void buildPonte() {
        guitarra.setPonte("Vibrato");
    }

    @Override
    public void buildAfinacao() {
        guitarra.setAfinacao("Padrão");
    }

    @Override
    public void buildAnoFabricacao() {
        guitarra.setAnoFabricacao(1954);
    }

}
