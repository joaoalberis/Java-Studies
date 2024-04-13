package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari(150);
        Uno uno = new Uno(120);

        ferrari.acelerar();
        System.out.println("Velocidade atual da ferrari => " + ferrari.velocidadeAtual);
        ferrari.ligarTurbo();
        ferrari.acelerar();
        System.out.println("Velocidade atual da ferrari => " + ferrari.velocidadeAtual);

        uno.acelerar();
        uno.acelerar();


        System.out.println("Velocidade atual do uno => " + uno.velocidadeAtual);

        ferrari.desacelerar();
        ferrari.ligarAr();
        ferrari.acelerar();
        System.out.println("Velocidade atual da ferrari => " + ferrari.velocidadeAtual);
        ferrari.desligarTurbo();
        ferrari.acelerar();
        ferrari.desacelerar();
        ferrari.desligarAr();
        ferrari.acelerar();
        System.out.println("Velocidade atual da ferrari => " + ferrari.velocidadeAtual);
        uno.desacelerar();
        uno.desacelerar();

        System.out.println("Velocidade atual do uno => " + uno.velocidadeAtual);
    }
}
