package classe.aulas;

import classe.desafios.DataComConstrutor;

public class DataThisTeste {

    public static void main(String[] args) {

        DataThis data1 = new DataThis();

        DataThis data2 = new DataThis(25, "Novembro", 1982);

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());

        data1.imprimirDataFormatada();
        data2.imprimirDataFormatada();
    }
}
