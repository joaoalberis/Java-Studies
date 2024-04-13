package classe.desafios;

public class DataComConstrutorTeste {
    public static void main(String[] args) {

        DataComConstrutor data1 = new DataComConstrutor();

        DataComConstrutor data2 = new DataComConstrutor(25, "Novembro", 1982);

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());

        data1.imprimirDataFormatada();
        data2.imprimirDataFormatada();
    }
}
