package oo.encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcesso() {

        // privado, apenas a classe ana consegue acessar
        // System.out.println(esposa.segredo);

        // default, apenas quem esta no mesmo pacote consegue acessar
        System.out.println(esposa.facoDentroDeCasa);

        // protected, quem esta no mesmo pacote ou herda de ana
        System.out.println(esposa.formaDeFalar);

        // public, todos tem acesso
        System.out.println(esposa.todosSabem);
    }
}
