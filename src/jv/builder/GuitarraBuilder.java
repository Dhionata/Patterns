package jv.builder;

public abstract class GuitarraBuilder {
    public GuitarraProduct guitarra;

    public GuitarraBuilder() {
        guitarra = new GuitarraProduct();
    }

    public abstract void buildCaptadores();

    public abstract void buildMadeira();

    public abstract void buildModelo();

    public abstract void buildPonte();

    public abstract void buildAfinacao();

    public abstract void buildAnoFabricacao();

    public GuitarraProduct getProduct() {
        return guitarra;
    }
}

