package controle.desafios;

public class DesafioFor {

    public static void main(String[] args) {

        String valor = "#";

        for (int i = 0; i<5;i++){
            System.out.println(valor);
            valor += "#";
        }

        // Versão Desafio
        // Não pode usar o valor numérico para controlar o laço!

        System.out.println();
        String valor1 = "#";

        for(char aChar = 'a'; aChar<'3';aChar++){
            System.out.println(valor1);
            valor1+="#";
        }

    }

}
