package classe.desafios;

public class DataTeste {

    public static void main(String[] args) {

        Data data1 = new Data();
        data1.dia = 13;
        data1.mes = "Abril";
        data1.ano = 2004;

        Data data2 = new Data();
        data2.dia = 25;
        data2.mes = "Novembro";
        data2.ano = 1982;

        System.out.printf("%d/%s/%d\n", data1.dia, data1.mes, data1.ano);
        System.out.printf("%d/%s/%d", data2.dia, data2.mes, data2.ano);
    }
}
