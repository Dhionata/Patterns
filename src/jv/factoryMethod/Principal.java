package jv.factoryMethod;

import jv.factoryMethod.contratos.FabricaAbstrata;
import jv.factoryMethod.contratos.FabricaHtml;
import jv.factoryMethod.contratos.FabricaWindows;

public class Principal {
    private static FabricaAbstrata fabricaAbstrata;

    public static void main(String[] args) {
        decisao();
        factoryMethod();
    }

    /* A fábrica de concreto geralmente é escolhida dependendo da configuração ou opções de ambiente.*/

    static void decisao() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            fabricaAbstrata = new FabricaWindows();
        } else {
            fabricaAbstrata = new FabricaHtml();
        }
    }

    /*Todo o código do cliente deve funcionarcom fábricas e produtos por meio de interfaces
              abstratas. Desta forma, não importa com qual
              fábrica ele funciona, com e que tipo de produto
              é devolvido.*/

    static void factoryMethod() {
        fabricaAbstrata.renderizarPainel();
    }
}

//Código que usei de referência : https://refactoring.guru/pt-br/design-patterns/factory-method/java/example