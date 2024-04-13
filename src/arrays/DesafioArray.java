package arrays;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantas notas você quer introduzir? ");
        int quantidadeDeNotas = entrada.nextInt();
        double[] notas = new double[quantidadeDeNotas];
        for (int i = 1; i <= quantidadeDeNotas; i++){
            System.out.printf("Digite a %d nota: ", i);
            notas[i-1] =  entrada.nextDouble();
        }
        double notaTotal = 0;
        for (double nota : notas){
            notaTotal+= nota;
        }
        System.out.println("A media do aluno é: " + notaTotal / notas.length);
    }

}
