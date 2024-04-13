package lambdas.exercicios;

public class Exec04 {
    public static void main(String[] args) {
        //Enunciado: Crie sua própria interface funcional e use-a em seu código.
        //Requisitos: O programa deve compilar e executar sem erros.

        // definindo o valor do produto
        double valorProduto = 5230.12;

        // criando o lambda para adicionar o imposto necessario ao produto
        tributoAdicional<Double> impostoNecessario = (valor, impost) -> valor * (1 - impost);

        // imprimindo o imposto necessario ao produto
        System.out.println("O imposto que será combrado pelo produto será: " + impostoNecessario.imposto(valorProduto, 0.50));

    }


    public interface tributoAdicional<T>{
        Object imposto(double valorProduto, double valorImposto);
    }
}
