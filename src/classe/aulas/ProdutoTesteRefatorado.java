package classe.aulas;

public class ProdutoTesteRefatorado {

    public static void main(String[] args) {
        ProdutoRefatoradoComMetodos p1 = new ProdutoRefatoradoComMetodos();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        ProdutoRefatoradoComMetodos p2 = new ProdutoRefatoradoComMetodos();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
    }

}
