package colecoes.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        // Estou definindo que a coleção irá aceitar apenas valores do tipo String
        Set<String> listaNaoOrdenado = new HashSet<>(); // HashSet defini os valores de forma não ordenada

        listaNaoOrdenado.add("Ana");
        listaNaoOrdenado.add("Carlos");
        listaNaoOrdenado.add("Luca");
        listaNaoOrdenado.add("Pedro");



        for(String candidato : listaNaoOrdenado){
            System.out.println(candidato);
        }
        System.out.println();

        // TreeSet defini os valores ordenamente pela ordem que foi adicionada
        Set<Integer> listaOrdenada = new TreeSet<>();
        listaOrdenada.add(1);
        listaOrdenada.add(2);
        listaOrdenada.add(3);
        listaOrdenada.add(4);
        for (int candidato : listaOrdenada){
            System.out.println(candidato);
        }
    }
}
