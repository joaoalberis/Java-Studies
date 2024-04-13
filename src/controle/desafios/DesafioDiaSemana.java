package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do dia da semana: ");
        String semana = entrada.nextLine();

        if (semana.equalsIgnoreCase("Domingo")){
            System.out.println("O dia da semana é -> 1");
        } else if (semana.equalsIgnoreCase("Segunda")){
            System.out.println("O dia da semana é -> 2");
        } else if (semana.equalsIgnoreCase("Terça")){
            System.out.println("O dia da semana é -> 3");
        } else if (semana.equalsIgnoreCase("Quarta")){
            System.out.println("O dia da semana é -> 4");
        } else if (semana.equalsIgnoreCase("Quinta")){
            System.out.println("O dia da semana é -> 5");
        } else if (semana.equalsIgnoreCase("Sexta")){
            System.out.println("O dia da semana é -> 6");
        } else if (semana.equalsIgnoreCase("Sabado")){
            System.out.println("O dia da semana é -> 7");
        }else {
            System.out.println("Dia Invalido!");
        }

    }

}
