package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite quantos alunos deseja registrar: ");
        int quantidadeDeAlunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int quantidadeDeNotasPorAlunos = entrada.nextInt();

        double[][] notasPorAluno = new double[quantidadeDeAlunos][quantidadeDeNotasPorAlunos];

        double total = 0;

        for (int i = 0; i<quantidadeDeAlunos;i++){
            System.out.printf("Vamos registrar as notas do %d aluno\n", i+1);
            for(int j = 0; j<quantidadeDeNotasPorAlunos;j++){
                System.out.printf("Digite a %d do aluno: ", j+1);
                notasPorAluno[i][j] = entrada.nextDouble();
                total += notasPorAluno[i][j];
            }
            System.out.println();
        }

        double mediaDaTurma = total * (quantidadeDeNotasPorAlunos * quantidadeDeAlunos);

        System.out.println("A media da turma é: " + mediaDaTurma);

        entrada.close();
    }
}
