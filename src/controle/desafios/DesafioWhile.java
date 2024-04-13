package controle.desafios;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valor = 0;
        double totalNotas = 0;
        int notasValidas = 0;

        while(valor != -1){
            System.out.print("Digite uma nota (ou -1 p/ sair): ");
            valor = entrada.nextInt();
            if (valor <= 10 && valor >= 0){
                totalNotas+=valor;
                notasValidas++;
            }else if (valor != -1){
                System.out.println("Nota invalida");
            }
        }

        System.out.printf("A media dos alunos é: %.2f ", totalNotas/notasValidas);

        entrada.close();
    }

}
