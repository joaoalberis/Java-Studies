package classe.aulas;

public class AreaCirc {

    double raio;

    // FINAL - TRANSFORMA O VALOR PARA UMA CONSTANTE E NAO MAIS UMA VARIAVEL;
    // STATIC - INDICA QUE O VALOR DE PI FAZ PARTE DO MEMBRO DA CLASSE E NAO MAIS DA INSTANCIA;
    final static double PI = 3.14;

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }

    double area(){
        return PI * Math.pow(raio, 2);
    }

    static double area(double raioInicial){
        return PI * Math.pow(raioInicial, 2);
    }
}
