package controle.exercicios;

import java.util.Scanner;

public class Exec08 {

    // Criar um programa que receba uma palavra e imprime no console letra por letra.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = entrada.next();

        for (int i = 0; i <palavra.length(); i++){
            System.out.println(palavra.charAt(i));
        }
    }
}
