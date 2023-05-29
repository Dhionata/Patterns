package jv.composite;

import java.awt.*;

public final class Ponto extends FormaBase {
    private final int PONTO_TAMANHO = 3;

    Ponto(int x, int y, Color color) {
        super(x, y, color);
    }

    public static Ponto criarPonto(int x, int y, Color color) {
        return new Ponto(x, y, color);
    }

    @Override
    public int getLargura() {
        return PONTO_TAMANHO;
    }

    @Override
    public int getAltura() {
        return PONTO_TAMANHO;
    }

    @Override
    public void pintar(Graphics grafico) {
        super.pintar(grafico);
        grafico.fillRect(x - 1, y - 1, getLargura(), getAltura());
    }
}