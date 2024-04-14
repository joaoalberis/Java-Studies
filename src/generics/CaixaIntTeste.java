package generics;

import java.util.function.BiFunction;

public class CaixaIntTeste {
    public static void main(String[] args) {
        CaixaInt caixaA = new CaixaInt(); // A classe CaixaInt ja está sendo responsavel por cuidar do tipo.
        caixaA.guardar(50);

        Integer coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }


}
