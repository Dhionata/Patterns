package jv.builder;

import jv.builder.modelos.IcemanBuilder;
import jv.builder.modelos.LesPaulBuilder;
import jv.builder.modelos.StratocasterBuilder;

public class Main {
    public static void main(String[] args) {
        // Objeto/Produto Guitarra
        GuitarraProduct guitarra;

        // Classe responsável por chamar a classe de produção
        // (no caso do exemplo do professor PPDirector),
        // o produto é inserido dentro da variável guitarra
        DiretorDeProducao diretorDeProducao = new DiretorDeProducao(new LesPaulBuilder());
        guitarra = diretorDeProducao.getProduct();

        System.out.println(guitarra.toString());

        // O processo se repete para a produção das outras guitarras
        diretorDeProducao = new DiretorDeProducao(new IcemanBuilder());
        guitarra = diretorDeProducao.getProduct();

        System.out.println(guitarra.toString());

        diretorDeProducao = new DiretorDeProducao(new StratocasterBuilder());
        guitarra = diretorDeProducao.getProduct();

        System.out.println(guitarra.toString());
    }
}
