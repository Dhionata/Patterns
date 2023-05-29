package jv.composite;

import java.awt.*;

public final class Retangulo extends FormaBase {
    public int width;
    public int height;

    private Retangulo(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public static Retangulo criarRetangulo(int x, int y, int width, int height, Color color) {
        return new Retangulo(x, y, width, height, color);
    }

    @Override
    public int getLargura() {
        return width;
    }

    @Override
    public int getAltura() {
        return height;
    }

    @Override
    public void pintar(Graphics graphics) {
        super.pintar(graphics);
        graphics.drawRect(x, y, getLargura() - 1, getAltura() - 1);
    }
}