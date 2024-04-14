package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        // CaixaNumero<String> caixaA = new CaixaNumero<>(); // Não é possivel ser do tipo String, pois foi adicionada uma restrição na classe Caixa Numero, que permiti apenas tipos de numeros
        // caixaA.guardar("Teste");


        CaixaNumero<Double> caixaB = new CaixaNumero<>();
        caixaB.guardar(2.3);
    }
}
