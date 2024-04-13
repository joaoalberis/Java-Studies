package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

    Ana sogra = new Ana();

    void testeAcesso() {

        // privado, apenas a classe ana consegue acessar
        // System.out.println(esposa.segredo);

        // default, apenas quem esta no mesmo pacote consegue acessar
        // System.out.println(mae.facoDentroDeCasa);

        // protected, quem esta no mesmo pacote ou herda de ana
        //System.out.println(formaDeFalar);

        // public, todos tem acesso
        System.out.println(sogra.todosSabem); // julia tem acesso apenas ao atributos com public, pois não herda de ana e nem esta no mesmo pacote
    }
}
