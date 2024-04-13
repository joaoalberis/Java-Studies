package streamapi;

import streamapi.reduce.Aluno;

import java.util.Arrays;
import java.util.List;

// Contem alguns outros metodos de stream
public class Outros {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Pedro", 6.1);
        Aluno a7 = new Aluno("Gui", 8.1);
        Aluno a8 = new Aluno("Maria", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);


        // verifica os valores distintos
        System.out.println("distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream().distinct()
                .skip(2) // irá pegar os valores apos o 2 elemento
                .limit(2) // irá pegar apenas 2 elementos
                .forEach(System.out::println);
        alunos.stream().distinct()
                .limit(2) // Irá pegar apenas 2 valores
                .skip(1) // Pegará apenas o elemento apos o 1
                .forEach(System.out::println);
    }
}
