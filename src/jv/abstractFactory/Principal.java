package jv.abstractFactory;

public class Principal {
    public static void main(String[] args) {
        Hamburgaria h1 = new Hamburgaria();
        Hamburgaria h2 = new Hamburgaria();
        Hamburgaria h3 = new Hamburgaria();
        h1.criarHamburguer("minas", "completo");
        h2.criarHamburguer("goias", "extra");
        h3.criarHamburguer("goias", "básico");
        h1.criarHamburguer("minas", "completo");

        h1.criarHamburguer("goias", "extra");

        //Tentei prof.

    }
}
