package controle.exercicios;

import java.util.Scanner;

public class Exec01 {

    public static void main(String[] args) {

        //  Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = entrada.nextDouble();

        if ((valor >= 0 && valor <= 10) && valor % 2 == 0){
            System.out.println("O numero está entre 0 e 10 e é par");
        }else {
            System.out.println("O numero não atende aos requisitos!");
        }

    }

}
