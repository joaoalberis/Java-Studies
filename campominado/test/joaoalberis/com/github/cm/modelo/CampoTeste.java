package joaoalberis.com.github.cm.modelo;

import joaoalberis.com.github.cm.excecao.ExplosaoException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CampoTeste {

    private Campo campo = new Campo(3, 3);

    @Test
    void testeVizinhoDireita(){
        Campo vizinho = new Campo(3, 4);
        boolean resultado = campo.adicioanrVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    void testeVizinhoEsquerdo(){
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicioanrVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    void testeVizinhoEmbaixo(){
        Campo vizinho = new Campo(4, 3);
        boolean resultado = campo.adicioanrVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    void testeVizinhoEmCima(){
        Campo vizinho = new Campo(2, 3);
        boolean resultado = campo.adicioanrVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDiagonal(){
        Campo vizinho1 = new Campo(2, 2);
        Campo vizinho2 = new Campo(2, 4);
        Campo vizinho3 = new Campo(4, 2);
        Campo vizinho4 = new Campo(4, 4);
        boolean resultado = campo.adicioanrVizinho(vizinho1);
        boolean resultado2 = campo.adicioanrVizinho(vizinho2);
        boolean resultado3 = campo.adicioanrVizinho(vizinho3);
        boolean resultado4 = campo.adicioanrVizinho(vizinho4);

        assertTrue(resultado);
        assertTrue(resultado2);
        assertTrue(resultado3);
        assertTrue(resultado4);
    }

    @Test
    void testeNaoVizinho(){
        Campo vizinho = new Campo(1, 1);

        boolean resultado = campo.adicioanrVizinho(vizinho);

        assertFalse(resultado);
    }

    @Test
    void testeValorPadraoAtributoMarcado(){
        assertFalse(campo.isMarcado());
    }

    @Test
    void testeAlternarMarcacao(){
        campo.alternarMarcacao();
        assertTrue(campo.isMarcado());
    }

    @Test
    void testeAlternarMarcacaoDuasChamadas(){
        campo.alternarMarcacao();
        campo.alternarMarcacao();
        assertFalse(campo.isMarcado());
    }

    @Test
    void testeAbrirNaoMinadoNaoMarcado(){
        assertTrue(campo.abrir());
    }

    @Test
    void testeAbrirNaoMinadoMarcado(){
        campo.alternarMarcacao();
        assertFalse(campo.abrir());
    }

    @Test
    void testeAbrirMinadoMarcado(){
        campo.alternarMarcacao();
        campo.minar();
        assertFalse(campo.abrir());
    }

    @Test
    void testeAbrirMinadoNaoMarcado(){
        campo.minar();

        assertThrows(ExplosaoException.class, () -> {
            campo.abrir();
        });
    }

    @Test
    void testeAbrirComVizinhos1() {
        Campo campo11 = new Campo(1,1);
        Campo campo22 = new Campo(2,2);

        campo.adicioanrVizinho(campo22);
        campo22.adicioanrVizinho(campo11);

        campo.abrir();

        assertTrue(campo22.isAberto() && campo11.isAberto());

    }

    @Test
    void testeAbrirComVizinhos2() {
        Campo campo11 = new Campo(1,1);
        Campo campo12 = new Campo(1, 2);
        campo12.minar();

        Campo campo22 = new Campo(2,2);
        campo22.adicioanrVizinho(campo11);
        campo22.adicioanrVizinho(campo12);

        campo.adicioanrVizinho(campo22);
        campo.abrir();

        assertTrue(campo22.isAberto() && !campo11.isAberto());

    }

    @Test
    void testeObjetivoAlcançadoDesvendado(){
        campo.abrir();
        assertTrue(campo.objetivoAlcancado());
    }

    @Test
    void testeObjetivoAlcançadoProtegido(){
        campo.alternarMarcacao();
        campo.minar();
        assertTrue(campo.objetivoAlcancado());
    }

    @Test
    void testeObjetivoNaoAlcançado(){
        campo.alternarMarcacao();
        campo.abrir();
        assertFalse(campo.objetivoAlcancado());
    }

    @Test
    void testeToString(){
        Campo marcado = new Campo(3,2);
        marcado.alternarMarcacao();

        Campo minado = new Campo(5,5);
        minado.minar();

        Campo bombas = new Campo(5,4);
        bombas.abrir();
        bombas.adicioanrVizinho(minado);

        Campo aberto = new Campo(2,2);
        aberto.abrir();

        Campo livre = new Campo(2, 3);
        livre.adicioanrVizinho(aberto);
        aberto.adicioanrVizinho(livre);

        assertEquals(marcado.toString(),"X");
        assertEquals(bombas.toString(),"1");
        assertEquals(aberto.toString()," ");
        assertEquals(livre.toString(), "?");
    }

    @Test
    void testeReiniciarJogo(){
        campo.abrir();
        campo.reiniciar();

        assertFalse(campo.isMarcado() && campo.isAberto() && !campo.abrir());
    }

}
