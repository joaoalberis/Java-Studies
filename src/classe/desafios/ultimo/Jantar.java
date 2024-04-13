package classe.desafios.ultimo;

public class Jantar {

    public static void main(String[] args) {
        Comida c1 = new Comida("Feijão", 0.300);
        Comida c2 = new Comida("Arroz", 0.240);
        Pessoa p = new Pessoa("João", 47.500);

        System.out.println("O peso antes de comer era: " + p.peso);

        p.comer(c1);

        System.out.println("Peso apos comer o feijão: " + p.peso);

        p.comer(c2);

        System.out.println("Peso apos comer o arroz: " + p.peso);
    }
}
