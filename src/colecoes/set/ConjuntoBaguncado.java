package colecoes.set;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "rawtypes"})
public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        // Adiciona um novo valor para o conjunto
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println(conjunto);

        // Imprimite o tamanho do conjunto
        System.out.println("Tamanho é " + conjunto.size());

        // O conjunto não contem sensitive case
        conjunto.add("Teste");
        conjunto.add('X');
        System.out.println("Tamanho é " + conjunto.size());

        // Remove um valor
        System.out.println(conjunto.remove("teste")); // retorna false, pois não existi um valor teste
        System.out.println(conjunto.remove("Teste")); // retorna true, pois remove com sucesso o valor Teste

        System.out.println("Tamanho é " + conjunto.size());

        // verifica se o conjunto contem um determinado elemento
        System.out.println(conjunto.contains("Teste")); // false, pois o valor Teste foi removido
        System.out.println(conjunto.contains(1)); // true, pois o valor 1 esta presente no hashset

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        //conjunto.addAll(nums); // Uniao entre 2 conjuntos
        // Ira renter oque tem em num e conjunto de igual
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        // ira remover todos os valores
        conjunto.clear();
        System.out.println(conjunto);

    }
}
