package jv.builder;

public class DiretorDeProducao {

    private final GuitarraBuilder builder;

    public DiretorDeProducao(GuitarraBuilder guitarra) {
        this.builder = guitarra;
    }

    public void builderGuitarra() {
        builder.buildModelo();
        builder.buildAfinacao();
        builder.buildAnoFabricacao();
        builder.buildCaptadores();
        builder.buildMadeira();
        builder.buildPonte();
    }

    public GuitarraProduct getProduct() {
        builderGuitarra();
        return builder.getProduct();
    }
}
