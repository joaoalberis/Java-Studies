package controle.exercicios;

import java.util.Scanner;

public class Exec09 {

    // Crie um programa que recebe 10 valores e ao final imprima o maior número.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int maiorValor = 0;
        for (int i = 1; i<=10;i++){
            System.out.printf("Digite o %d valor: ", i);
            int valor = entrada.nextInt();
            if (valor > maiorValor){
                maiorValor = valor;
            }
        }
        System.out.printf("O maior valor inserido foi %d", maiorValor);
    }

}
