package classe.aulas;

public class ProdutoComConstrutorTeste {
    public static void main(String[] args) {

        ProdutoComConstrutor p1 = new ProdutoComConstrutor();
        p1.nome = "Caneta Preta";
        p1.preco = 12.56;
        p1.desconto = 0.29;

        ProdutoComConstrutor p2 = new ProdutoComConstrutor("Notebook");
        p2.preco = 4356.89;
        p2.desconto = 0.25;

        ProdutoComConstrutor p3 = new ProdutoComConstrutor("Carro", 20000.0);
        p3.desconto = 0.3;

        ProdutoComConstrutor p4 = new ProdutoComConstrutor("Moto", 10000.0, 0.4);

        System.out.println(p1.nome);
        System.out.println(p2.nome);
        System.out.println(p3.nome);
        System.out.println(p4.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double precoFinal3 = p3.precoComDesconto();
        double precoFinal4 = p3.precoComDesconto(0.05);
        double mediaCarrinho = (precoFinal1 + precoFinal2 + precoFinal3 + precoFinal4) / 4;
        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
    }
}
