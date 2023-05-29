package jv.composite;

import java.awt.*;

public interface Forma {

    int getX();

    int getY();

    int getLargura();

    int getAltura();

    void mover(int x, int y);

    boolean dentroDoLimite(int x, int y);

    void select();

    void unSelect();

    boolean selecionado();

    void pintar(Graphics graphics);
}

