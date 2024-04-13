package colecoes.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Principe"); // retorna true ou false, caso adicione ou nao o valor
        livros.push("Don Quixote"); // retorna uma exceção, caso não seja possivel adicionar
        livros.push("O Hobbit");

        // Mesma essencia do queue, porem o stack utiliza o LiFO, assim mostrando o ultimo elemento adicionado
        System.out.println(livros.peek());
        System.out.println(livros.element());

        // Mesma essencia do queue, porem o stack utiliza o LiFO, assim removendo o ultimo elemento adicionado
        System.out.println(livros.poll());
        System.out.println(livros.remove());

        livros.size();
        livros.clear();
        livros.contains("O Pequeno Principe");
        livros.isEmpty();
    }
}
