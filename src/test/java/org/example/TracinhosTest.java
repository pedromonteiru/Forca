package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TracinhosTest {

    Tracinhos tracinhos;

    @Test
    void failConstructors() {
        try{
            tracinhos = new Tracinhos(0);
        }catch (Exception e){
            assertEquals(e.getMessage(), "Tamanho incorreto!");
        }
    }

    @Test
    void failConstructors2() {
        try{
            Tracinhos tracinhosNull = null;
            tracinhos = new Tracinhos(tracinhosNull);
        }catch (Exception e){
            assertEquals(e.getMessage(), "Construtor de cópia nulo!");
        }
    }

    @Test
    void revele() {
        try{
            tracinhos = new Tracinhos(4);
            tracinhos.revele(1, 'A');
            assertEquals(tracinhos.toString(),"_A__");
        }catch (Exception e){}
    }

    @Test
    void revele2() {
        try{
            tracinhos = new Tracinhos(4);
            tracinhos.revele(5, 'A');
        }catch (Exception e){
            assertEquals(e.getMessage(), "Não existente!");
        }
    }

    @Test
    void isAindaComTracinhos() {
        try{
            tracinhos = new Tracinhos(4);
            assertTrue(tracinhos.isAindaComTracinhos());
        }catch (Exception e){}
    }

    @Test
    void testToString() {
        try{
            tracinhos = new Tracinhos(4);
            assertEquals(tracinhos.toString(), "____");
        }catch (Exception e){}
    }

    @Test
    void testEquals() {
        try{
            tracinhos = new Tracinhos(4);
            Tracinhos tracinhosTest = new Tracinhos(4);
            assertEquals(tracinhos,tracinhosTest);
        }catch (Exception e){}
    }

    @Test
    void testEquals2() {
        try{
            tracinhos = new Tracinhos(4);
            Tracinhos tracinhosTest = tracinhos;
            assertEquals(tracinhos,tracinhosTest);
        }catch (Exception e){}
    }

    @Test
    void testEquals3() {
        try{
            tracinhos = new Tracinhos(4);
            Tracinhos tracinhosTest = new Tracinhos(5);
            assertNotEquals(tracinhos,tracinhosTest);
        }catch (Exception e){}
    }

    @Test
    void testHashCode() {
        try{
            tracinhos = new Tracinhos(4);
            assertEquals(tracinhos.hashCode(), 42802);
        }catch (Exception e){}
    }

    @Test
    void testClone() {
        try{
            tracinhos = new Tracinhos(4);
            Tracinhos tracinhosClone = (Tracinhos) new Tracinhos(tracinhos);
            assertEquals(tracinhos, tracinhosClone);
        }catch (Exception e){}
    }

    @Test
    void testClone2() {
        try{
            tracinhos = new Tracinhos(4);
            Tracinhos tracinhosClone = (Tracinhos)tracinhos.clone();
            assertEquals(tracinhos, tracinhosClone);
        }catch (Exception e){}
    }
}