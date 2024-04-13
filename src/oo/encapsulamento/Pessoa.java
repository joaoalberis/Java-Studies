package oo.encapsulamento;

public class Pessoa {

    private int idade;

    // Getter
    public int getIdade(){
        return this.idade;
    }

    // Setter
    public void setIdade(int idade){
        if (idade > 0 && idade <= 120){
            this.idade = idade;
        }
    }
}
