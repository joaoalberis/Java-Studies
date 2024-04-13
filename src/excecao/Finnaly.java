package excecao;

import java.util.Scanner;

public class Finnaly {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println(7 / entrada.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {// O bloco finally sempre será executado, independente de ocorrer uma exceção ou não.
            System.out.println("Finalmente");
        }
    }
}
