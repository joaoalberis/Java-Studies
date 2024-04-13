package controle.aulas;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String valor = "";

        while (!valor.equalsIgnoreCase("sair")){
            System.out.print("Caso queira sair digite 'Sair'");
            valor = entrada.next();
        }

    }

}
