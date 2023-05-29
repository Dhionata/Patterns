package jv.composite;

import java.awt.*;

public final class Principal {
    public static void main(String[] args) {
        EditorDeImagem editor = EditorDeImagem.criarEditorImagem();

        editor.carregarFormas(
                Circulo.criarCirculo(10, 10, 10, Color.BLUE),

                FormaComposta.criarFormaComposta(
                        Circulo.criarCirculo(110, 110, 50, Color.RED),
                        Ponto.criarPonto(160, 160, Color.RED)
                ),

                FormaComposta.criarFormaComposta(
                        Retangulo.criarRetangulo(250, 250, 100, 100, Color.GREEN),
                        Ponto.criarPonto(240, 240, Color.GREEN),
                        Ponto.criarPonto(240, 360, Color.GREEN),
                        Ponto.criarPonto(360, 360, Color.GREEN),
                        Ponto.criarPonto(360, 240, Color.GREEN)
                )
        );
    }
}

//código totalmente baseado em : https://refactoring.guru/pt-br/design-patterns/composite/java/example