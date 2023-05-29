package jv.composite;

import java.awt.*;

abstract class FormaBase implements Forma {
    public int x;
    public int y;
    public Color cor;
    private boolean selecionado = false;

    public FormaBase(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.cor = color;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getLargura() {
        return 0;
    }

    @Override
    public int getAltura() {
        return 0;
    }

    @Override
    public void mover(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public boolean dentroDoLimite(int x, int y) {
        return x > getX() && x < (getX() + getLargura()) &&
                y > getY() && y < (getY() + getAltura());
    }

    @Override
    public void select() {
        selecionado = true;
    }

    @Override
    public void unSelect() {
        selecionado = false;
    }

    @Override
    public boolean selecionado() {
        return selecionado;
    }

    void habilitarSelecaoEstilo(Graphics graficos) {
        graficos.setColor(Color.LIGHT_GRAY);

        Graphics2D g2 = (Graphics2D) graficos;
        float[] dash1 = {2.0f};
        g2.setStroke(new BasicStroke(1.0f,
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER,
                2.0f, dash1, 0.0f));
    }

    void desabilitarSelecaoEstilo(Graphics graphics) {
        graphics.setColor(cor);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke());
    }

    @Override
    public void pintar(Graphics graphics) {
        if (selecionado()) {
            habilitarSelecaoEstilo(graphics);
        } else {
            desabilitarSelecaoEstilo(graphics);
        }

    }
}