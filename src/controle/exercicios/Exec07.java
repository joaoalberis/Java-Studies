package controle.exercicios;

import java.util.Scanner;

public class Exec07 {

    // Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos,
    // caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int somaNumeros = 0;
        int valor = 0;
        do {
            System.out.print("Digite um numero positivo(caso queira encerrar digite um numero negativo): ");
            valor = entrada.nextInt();
            if (valor > 0){
                somaNumeros+=valor;
                System.out.println("A soma dos numeros inseridos até o momento da um resultado de -> " + somaNumeros);
            }
        } while (valor > 0);
    }
}
