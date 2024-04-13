package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        // criando um array do tipo double com 3 espaços.
        double[] notasAlunoA = new double[3];
        // atribuindo valores em cada espaço do array
        // OBS: um array começa do valor 0
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;
        // pecorrendo todo o array;
        for(int i = 0; i < notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }

        System.out.println(totalAlunoA / notasAlunoA.length);

        // Iniciando um array com valores ja definidos, seu tamanho é definido para a quantidade de valores atribuidos
        double[] notasAlunoB = { 6.9, 8.9, 5.5, 10};
        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
