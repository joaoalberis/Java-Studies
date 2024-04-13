package streamapi;

import streamapi.reduce.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        // retorna true, caso todos derem match, ou seja, caso todos os alunos sejam aprovados.
        System.out.println(alunos.stream().allMatch(aprovado));

        // retorna true, caso pelo menos 1 dos alunos seja aprovado
        System.out.println(alunos.stream().anyMatch(aprovado));

        // retorna true, caso todos tenham sido reprovados
        System.out.println(alunos.stream().noneMatch(aprovado));
    }
}
