package classe.desafios.ultimo;

public class Pessoa {

    String nome;
    double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida){
        this.peso = this.peso + comida.peso;
    }
}
