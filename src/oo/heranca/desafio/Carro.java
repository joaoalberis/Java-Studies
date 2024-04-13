package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    private int delta = 5;
    protected int velocidadeAtual;

    public Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(){
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else {
            velocidadeAtual += delta;
        }
    }

    void desacelerar(){
        if (velocidadeAtual > 0){
            velocidadeAtual -= 5;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
