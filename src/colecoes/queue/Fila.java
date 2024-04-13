package colecoes.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionam elemento na fila
        // Diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); // retorna false
        fila.offer("Bia"); // chama uma exceção
        fila.offer("Carlos");
        fila.add("Daniel");
        fila.offer("Rafael");
        fila.add("Guilherme");

        // Peek e Element -> Mostram o primeiro elemento da fila
        // Diferença é o comportamento quando a fila esta vazia!
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.element()); // é chamada uma exceção "NoSuchElementException"

        // mostra o tamanho da fila
        System.out.println(fila.size());

        // verifica se a fila esta vazia
        System.out.println(fila.isEmpty());

        // fila.clear() -> remove todos os elementos da fila
        fila.contains("Guilherme"); // verifica se a fila contem um elemento

        // retorna o primeiro elemento e a remove
        System.out.println(fila.poll()); // caso a fila esteja vazia, ele retorna null
        System.out.println(fila.remove()); // caso a fila esteja vazia, ele lança uma exceção
    }
}
