package lambdas.Funcionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//Supplier, não recebe argumento, mas retornar um tipo generico.
//Nesse uso, Não recebemos nada de argumentos, mas retornamos uma lista.
public class Suppliers {
    public static void main(String[] args) {
        Supplier<List<String>> umLista = () -> Arrays.asList("ana", "gui", "lia", "bia");
        System.out.println(umLista.get());
    }
}
