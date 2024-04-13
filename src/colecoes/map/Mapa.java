package colecoes.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        // Caso ja tenha o valor da key, ele substitui o valor
        usuarios.put(1, "Roberto");
        // Como a key 1 ja existi, o valor Roberto é substituido por Ricardo
        usuarios.put(1, "Ricardo");
        usuarios.put(2, "Rafaela");
        usuarios.put(3, "Rebeca");
        usuarios.put(20, "Jose");

        // mostra o tamanho do map
        System.out.println(usuarios.size());
        // verifica se o map contem valores(true ou false)
        System.out.println(usuarios.isEmpty());

        // retorna todas as chaves do map -> [1, 2, 3]
        System.out.println(usuarios.keySet());

        // retorna todos os valores -> ["Ricardo", "Rafaela", "Rebeca"]
        System.out.println(usuarios.values());

        // retorna as chaves com seu devido valor -> [1=Ricardo, 2=Rafaela, 3=Rebeca]
        System.out.println(usuarios.entrySet());

        // verifica se o map contem uma determinada key
        System.out.println(usuarios.containsKey(3));

        // verifica se o map contem um determinado valor
        System.out.println(usuarios.containsValue("Ricardo"));

        // obtem o valor pela key
        System.out.println(usuarios.get(20));
        // remove a key/valor pela key e retorna o valor removido
        System.out.println(usuarios.remove(20)); // caso não tenha a key passa, retorna null
        // removendo a key/valor caso a key e o valor estejam presente e retorna true caso consiga
        System.out.println(usuarios.remove(20, "Jose")); // caso não tenha um valor Jose na key 20, ele retorna false


        // pecorre todas as chaves do map
        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        // pecorre todos os valores do map
        for (String valor : usuarios.values()){
            System.out.println(valor);
        }

        // pecorre todas as [chave=valor] do map
        for (Entry<Integer, String> registro : usuarios.entrySet()){
            // pegando a key com getKey e o valor com getValue;
            System.out.println(registro.getKey() + "==>" + registro.getValue());
        }
    }
}
