package colecoes.list;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");

        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        // Aceita valores repetidos
        lista.add(new Usuario("Carlos"));

        // obtendo o valor pelo index
        System.out.println(lista.get(3).nome);

        // Removendo o valor no indice 3
        lista.remove(3); // retorna o valor removido
        // Removendo o valor pelo objeto
        lista.remove(u1); // retorna um boolean

        // Verificando se a lista contem um valor
        System.out.println("Tem? " + lista.contains(new Usuario("Carlos")));

        // pecorrendo toda a lista
        for (Usuario u: lista){
            System.out.println(u.nome);
        }
    }
}
