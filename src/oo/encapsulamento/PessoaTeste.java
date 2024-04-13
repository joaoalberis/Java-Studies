package oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        // p1.idade = -30; // setar
        p1.setIdade(-30);

        System.out.println(p1.getIdade());

        p1.setIdade(30);
        System.out.println(p1.getIdade());
    }
}
