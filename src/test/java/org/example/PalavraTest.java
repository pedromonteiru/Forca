package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalavraTest {

    Palavra palavra;

    @Test
    void construtorNulo(){
        try{
            palavra = new Palavra("");
        }catch (Exception e){
            e.getMessage().equals("Insira um caracter");
            System.out.println(e.getMessage());
        }
    }

    @Test
    void getQuantidade() {
        try{
            palavra = new Palavra("JAVA");
            assertEquals(palavra.getQuantidade('A'), 2);
        }catch (Exception e){}
    }

    @Test
    void getQuantidade2() {
        try{
            palavra = new Palavra("JAVA");
            assertNotEquals(palavra.getQuantidade('A'), 3);
        }catch (Exception e){}
    }

    @Test
    void getPosicaoDaIezimaOcorrencia() {
        try{
            palavra = new Palavra("JAVA");
            palavra.getPosicaoDaIezimaOcorrencia(2, 'B');
        }catch (Exception e){
            e.getMessage().equals("Letra não existente!");
        }
    }

    @Test
    void getPosicaoDaIezimaOcorrencia2() {
        try{
            palavra = new Palavra("JAVA");
            assertEquals(palavra.getPosicaoDaIezimaOcorrencia(0, 'A'), 1);

        }catch (Exception e){
            e.getMessage().equals("Letra não existente!");
        }
    }

    @Test
    void getTamanho() {
        try{
            palavra = new Palavra("JAVA");
            assertEquals(palavra.getTamanho(), 4);
        }catch (Exception e){}
    }

    @Test
    void testToString() {
        try{
            palavra = new Palavra("JAVA");
            assertEquals(palavra.toString(), "JAVA");
        }catch (Exception e){}
    }

    @Test
    void testToString2() {
        try{
            palavra = new Palavra("JAVA");
            assertNotEquals(palavra.toString(), "C++");
        }catch (Exception e){}
    }

    @Test
    void testEquals() {
        try{
            palavra = new Palavra("JAVA");
            Palavra palavraToTest = new Palavra("JAVA");
            assertEquals(palavra, palavraToTest);
        }catch (Exception e){}
    }

    @Test
    void testEquals2() {
        try{
            palavra = new Palavra("JAVA");
            Palavra palavraToTest = new Palavra("JAVASCRIPT");
            assertNotEquals(palavra, palavraToTest);
        }catch (Exception e){}
    }

    @Test
    void testEquals3() {
        try{
            palavra = new Palavra("JAVA");
            Palavra palavraToTest = palavra;
            assertEquals(palavra, palavraToTest);
        }catch (Exception e){}
    }

    @Test
    void testHashCode() {
        try{
            palavra = new Palavra("JAVA");
            assertNotEquals(palavra.hashCode(), -10000);
        }catch (Exception e){}
    }

//    @Test
//    void compareTo() {
//
//    }
}