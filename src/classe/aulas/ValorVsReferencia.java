package classe.aulas;

import classe.desafios.DataComConstrutor;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; //atribuição por valor

        a++;
        b--;
        System.out.println(a + " " + b);

        DataComConstrutor d1 = new DataComConstrutor(1, "Julho", 2022);
        DataComConstrutor d2 = d1; // atribuição por referencia (objeto)

        d1.dia = 31;
        d2.mes = "Dezembro";
        d1.ano = 2025;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }

    static void voltarDataParaValorPadrao(DataComConstrutor d){
        d.dia = 1;
        d.mes = "Janeiro";
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a){
        a++;
    }
}
