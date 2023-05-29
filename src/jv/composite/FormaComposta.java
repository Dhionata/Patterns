package jv.composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class FormaComposta extends FormaBase {
    private final List<Forma> filhos = new ArrayList<>();

    private FormaComposta(Forma... components) {
        super(0, 0, Color.BLACK);
        adicionar(components);
    }

    public static FormaComposta criarFormaComposta(Forma... components) {
        return new FormaComposta(components);
    }

    public void adicionar(Forma componente) {
        filhos.add(componente);
    }

    public void adicionar(Forma... componentes) {
        filhos.addAll(Arrays.asList(componentes));
    }

    public void remover(Forma filho) {
        this.filhos.remove(filho);
    }

    public void remover(Forma... components) {
        filhos.removeAll(Arrays.asList(components));
    }

    public void limpar() {
        filhos.clear();
    }

    @Override
    public int getX() {
        if (filhos.size() == 0) {
            return 0;
        }
        int x = filhos.get(0).getX();
        for (Forma child : filhos) {
            if (child.getX() < x) {
                x = child.getX();
            }
        }
        return x;
    }

    @Override
    public int getY() {
        if (filhos.size() == 0) {
            return 0;
        }
        int y = filhos.get(0).getY();
        for (Forma filho : filhos) {
            if (filho.getY() < y) {
                y = filho.getY();
            }
        }
        return y;
    }

    @Override
    public int getLargura() {
        int larguraMaxima = 0;
        int x = getX();
        for (Forma filho : filhos) {
            int filhosRelativoX = filho.getX() - x;
            int filhoLargura = filhosRelativoX + filho.getLargura();
            if (filhoLargura > larguraMaxima) {
                larguraMaxima = filhoLargura;
            }
        }
        return larguraMaxima;
    }

    @Override
    public int getAltura() {
        int alturaMaxima = 0;
        int y = getY();
        for (Forma filho : filhos) {
            int filhosRelativoY = filho.getY() - y;
            int filhoAltura = filhosRelativoY + filho.getAltura();
            if (filhoAltura > alturaMaxima) {
                alturaMaxima = filhoAltura;
            }
        }
        return alturaMaxima;
    }

    @Override
    public void mover(int x, int y) {
        for (Forma filho : filhos) {
            filho.mover(x, y);
        }
    }

    @Override
    public boolean dentroDoLimite(int x, int y) {
        for (Forma filho : filhos) {
            if (filho.dentroDoLimite(x, y)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void unSelect() {
        super.unSelect();
        for (Forma filho : filhos) {
            filho.unSelect();
        }
    }

    public boolean selectChildAt(int x, int y) {
        for (Forma filho : filhos) {
            if (filho.dentroDoLimite(x, y)) {
                filho.select();
                return true;
            }
        }
        return false;
    }

    @Override
    public void pintar(Graphics graphics) {
        if (selecionado()) {
            habilitarSelecaoEstilo(graphics);
            graphics.drawRect(getX() - 1, getY() - 1, getLargura() + 1, getAltura() + 1);
            desabilitarSelecaoEstilo(graphics);
        }

        for (Forma filho : filhos) {
            filho.pintar(graphics);
        }
    }
}