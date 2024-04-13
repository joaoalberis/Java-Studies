package controle.exercicios;

import java.time.LocalDate;
import java.time.Year;

public class Exec02 {

    public static void main(String[] args) {

        // Criar um programa informa se o ano atual é um ano bissexto;

        int date = LocalDate.now().getYear();

        if (Year.isLeap(date)){
            System.out.printf("O ano de %d é bissexto", date);
        }else{
            System.out.printf("O ano de %d não é bissexto", date);
        }
    }

}
