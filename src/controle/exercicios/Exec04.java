package controle.exercicios;

import java.util.Scanner;

public class Exec04 {

    // Criar um programa que receba um número e diga se ele é um número primo.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int numerosDivisiveis = 0;

        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                numerosDivisiveis++;
                if (numerosDivisiveis > 2){
                    break;
                }
            }
        }

        if (numerosDivisiveis == 2) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
    }
}


