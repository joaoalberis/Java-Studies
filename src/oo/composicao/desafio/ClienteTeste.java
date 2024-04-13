package oo.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {
        // Criando o cliente
        Cliente cliente = new Cliente("João");

        // Criando as compras para associar ao cliente
        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        // Criando os itens para as compras
        Item item1 = new Item(new Produto("Caderno", 5.0), 3);
        Item item2 = new Item(new Produto("Lapis", 2.0), 4);
        Item item3 = new Item(new Produto("Livro", 200), 1);
        Item item4 = new Item(new Produto("HQs", 15), 2);

        // Associando os itens as suas devidas compras
        compra1.adicionarItem(item1);
        compra1.adicionarItem(item2);

        compra2.adicionarItem(item3);
        compra2.adicionarItem(item4);

        // associando as compras ao cliente
        cliente.adicionarCompras(compra1);
        cliente.adicionarCompras(compra2);

        // obtendo o valor total gasto em suas compras
        System.out.println("O cliente gastou um total de: " + cliente.obterValorTotal());
    }
}
