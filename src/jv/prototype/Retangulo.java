package jv.prototype;

public class Retangulo extends Forma {
    public int largura;
    public int altura;

    public Retangulo() {
    }

    public Retangulo(Retangulo retangulo) {
        super(retangulo);
        if (retangulo != null) {
            this.largura = retangulo.largura;
            this.altura = retangulo.altura;
        }
    }

    @Override
    public Retangulo clonar() {
        return new Retangulo(this);
    }

    @Override
    public boolean equals(Object objeto) {
        if (!(objeto instanceof Retangulo forma) || !super.equals(objeto)) return false;
        return forma.largura == largura && forma.altura == altura;
    }
}