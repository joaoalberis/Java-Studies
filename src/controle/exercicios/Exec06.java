package controle.exercicios;

import java.util.Scanner;

public class Exec06 {

    // Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável.
    // O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
    // e imprima se o número inserido é maior ou menor do que o número armazenado.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int valorAleatorio = (int) (Math.random() * 100);

        for (int tentativas = 10; tentativas > 0; tentativas--){
            System.out.println("Tente advinhar o numero, o valor esta entre 0 e 100");
            int valor = entrada.nextInt();
            if (valor == valorAleatorio){
                System.out.println("Parabens, Você acertou o numero aletoario -> " + valorAleatorio);
                break;
            }
            if (valor > valorAleatorio){
                System.out.println("O numero inserido é menor que o valor aleatorio gerado");
            }else {
                System.out.println("O numero inserido é maior que o valor aleatorio gerado");
            }
            System.out.println("Você ainda tem " + (tentativas - 1) + " tentativas");
        }

    }
}
