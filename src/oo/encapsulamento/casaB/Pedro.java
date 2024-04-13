package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    Ana mae = new Ana();

    void testeAcesso() {

        // privado, apenas a classe ana consegue acessar
        // System.out.println(esposa.segredo);

        // default, apenas quem esta no mesmo pacote consegue acessar
        // System.out.println(mae.facoDentroDeCasa);

        // protected, quem esta no mesmo pacote ou herda de ana
        System.out.println(formaDeFalar); // tem que ser acessado via herança

        // public, todos tem acesso
        System.out.println(mae.todosSabem);
    }
}
