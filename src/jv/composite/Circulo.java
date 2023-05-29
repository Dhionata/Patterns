package jv.composite;

import java.awt.*;

public final class Circulo extends FormaBase {
    public int radius;

    private Circulo(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    public static Circulo criarCirculo(int x, int y, int radius, Color color) {
        return new Circulo(x, y, radius, color);
    }

    @Override
    public int getLargura() {
        return radius * 2;
    }

    @Override
    public int getAltura() {
        return radius * 2;
    }

    public void pintar(Graphics graphics) {
        super.pintar(graphics);
        graphics.drawOval(x, y, getLargura() - 1, getAltura() - 1);
    }
}