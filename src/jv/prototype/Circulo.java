package jv.prototype;

public class Circulo extends Forma {
    public int raio;

    public Circulo() {
    }

    public Circulo(Circulo circulo) {
        super(circulo);
        if (circulo != null) {
            this.raio = circulo.raio;
        }
    }

    @Override
    public Circulo clonar() {
        return new Circulo(this);
    }

    @Override
    public boolean equals(Object objeto) {
        if (!(objeto instanceof Circulo forma) || !super.equals(objeto)) return false;
        return forma.raio == raio;
    }
}