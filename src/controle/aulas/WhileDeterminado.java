package controle.aulas;

public class WhileDeterminado {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 10){
            System.out.println("Bom Dia!");
            i++;
        }

        int contador = 1;

        while (contador <= 20){
            System.out.printf("contador = %d\n", contador);
            contador += 2;
        }
    }

}
