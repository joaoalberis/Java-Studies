package lambdas.Funcionais;

import java.util.Arrays;
import java.util.List;

//Consumer, Recebe um tipo como argumento, mas não retorna nada.
//Nesse uso, Recebemos um produto como argumento, mas nao retornamos nada, apenas imprimimos o nome do produto na tela
public class Consumers {

    public static void main(String[] args) {
        java.util.function.Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        Produto p1 = new Produto("Caneta", 12.54, 0.09);
        imprimir.accept(p1);

        Produto p2 = new Produto("Notebook", 2987.99, 0.25);
        Produto p3 = new Produto("Caderno", 19.9, 0.03);
        Produto p4 = new Produto("Borracha", 7.8, 0.18);
        Produto p5 = new Produto("Lapis", 4.39, 0.19);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        // Podemos utilizar a lambda forEach, pois o forEach recebe um consumer.
        produtos.forEach(imprimir);
    }
}
