package jv.prototype;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        List<Forma> copiasForma = new ArrayList<>();

        Circulo circulo = new Circulo();
        circulo.x = 5;
        circulo.y = 5;
        circulo.raio = 10;
        circulo.cor = "verde";
        formas.add(circulo);

        Circulo Circulo2 = circulo.clonar();
        formas.add(Circulo2);

        Retangulo retangulo = new Retangulo();
        retangulo.largura = 10;
        retangulo.altura = 15;
        retangulo.cor = "amarelo";
        formas.add(retangulo);

        clonarEComparar(formas, copiasForma);
    }

    private static void clonarEComparar(List<Forma> formas, List<Forma> copiaFormas) {
        for (Forma forma : formas) {
            copiaFormas.add(forma.clonar());
        }

        for (int i = 0; i < formas.size(); i++) {
            if (formas.get(i) != copiaFormas.get(i)) {
                System.out.println(i + ": são objetos diferentes");
                if (formas.get(i).equals(copiaFormas.get(i))) {
                    System.out.println(i + ": eles são idênticos");
                } else {
                    System.out.println(i + ": mas eles não são idênticos");
                }
            } else {
                System.out.println(i + ": os objetos são os mesmos =/");
            }
        }
    }
}

//referência do projeto : https://refactoring.guru/pt-br/design-patterns/prototype/java/example