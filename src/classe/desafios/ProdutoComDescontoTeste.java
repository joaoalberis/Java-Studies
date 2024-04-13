package classe.desafios;

import classe.aulas.ProdutoComConstrutor;

public class ProdutoComDescontoTeste {

    public static void main(String[] args) {

        ProdutoComDesconto p1 = new ProdutoComDesconto("Notebook", 3000);

        // preço com desconto padrao
        System.out.println(p1.precoComDesconto());

        ProdutoComDesconto p2 = new ProdutoComDesconto("Desktop", 6000);

        // Alterando o desconto em toda a loja
        ProdutoComDesconto.desconto = 0.5;
        System.out.println(p2.precoComDesconto());
    }

}
