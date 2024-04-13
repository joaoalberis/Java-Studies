package classe.desafios;

public class DataTesteRefatorado {
    public static void main(String[] args) {

        DataRefatorado data1 = new DataRefatorado();
        data1.dia = 13;
        data1.mes = "Abril";
        data1.ano = 2004;

        DataRefatorado data2 = new DataRefatorado();
        data2.dia = 25;
        data2.mes = "Novembro";
        data2.ano = 1982;

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());

        data1.imprimirDataFormatada();
        data2.imprimirDataFormatada();
    }

}
