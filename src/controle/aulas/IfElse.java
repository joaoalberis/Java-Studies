package controle.aulas;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        int valor = entrada.nextInt();

        if (valor % 2 == 0){
            System.out.println("Numero Par!");
        }else{
            System.out.println("Numero Impar!");
        }

    }

}
