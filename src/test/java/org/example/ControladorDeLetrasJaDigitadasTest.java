package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControladorDeLetrasJaDigitadasTest {
    ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas;

    @Test
    void testConstrutor(){
        try{
            ControladorDeLetrasJaDigitadas cNull = null;
            controladorDeLetrasJaDigitadas = new ControladorDeLetrasJaDigitadas(cNull);
        }catch (Exception e){
            assertEquals(e.getMessage(), "Construtor de cópia nulo!");
        }
    }

    @Test
    void isJaDigitada() {
        try{
        controladorDeLetrasJaDigitadas = new ControladorDeLetrasJaDigitadas();
        assertFalse(controladorDeLetrasJaDigitadas.isJaDigitada('T'));
        }
        catch (Exception e){}
        }

    @Test
    void isJaDigitada2() {
        try{
            controladorDeLetrasJaDigitadas = new ControladorDeLetrasJaDigitadas();
            controladorDeLetrasJaDigitadas.registre('A');
            assertTrue(controladorDeLetrasJaDigitadas.isJaDigitada('A'));
        }
        catch (Exception e){}
    }

    @Test
    void registre() {
        try{
        controladorDeLetrasJaDigitadas = new ControladorDeLetrasJaDigitadas();
        controladorDeLetrasJaDigitadas.registre('A');
        assertTrue(controladorDeLetrasJaDigitadas.isJaDigitada('A'));
        }
        catch (Exception e){}
    }

    @Test
    void registre2() {
        try{
            controladorDeLetrasJaDigitadas = new ControladorDeLetrasJaDigitadas();
            controladorDeLetrasJaDigitadas.registre('A');
            controladorDeLetrasJaDigitadas.registre('A');
        }
        catch (Exception e){
            assertEquals(e.getMessage(), "Letra ja digitada!");
        }
    }

    @Test
    void registre3() {
        try{
            controladorDeLetrasJaDigitadas = new ControladorDeLetrasJaDigitadas();
            controladorDeLetrasJaDigitadas.registre('A');
            assertFalse(controladorDeLetrasJaDigitadas.isJaDigitada('J'));
        }
        catch (Exception e){}
    }

    @Test
    void testToString() {
        try{
            controladorDeLetrasJaDigitadas = new ControladorDeLetrasJaDigitadas();
            controladorDeLetrasJaDigitadas.registre('A');
            controladorDeLetrasJaDigitadas.registre('B');
            assertEquals(controladorDeLetrasJaDigitadas.toString(), "A,B");
        }catch (Exception e){}
    }

    @Test
    void testEquals() {
        try{
            controladorDeLetrasJaDigitadas = new ControladorDeLetrasJaDigitadas();
            controladorDeLetrasJaDigitadas.registre('A');
            ControladorDeLetrasJaDigitadas controlCopy = (ControladorDeLetrasJaDigitadas) controladorDeLetrasJaDigitadas.clone();
            assertTrue(controladorDeLetrasJaDigitadas.equals(controlCopy));
        }catch (Exception e){}
    }

    @Test
    void testHashCode() {
        try{
            controladorDeLetrasJaDigitadas = new ControladorDeLetrasJaDigitadas();
            assertEquals(controladorDeLetrasJaDigitadas.hashCode(), 299);
        }catch(Exception e){}
    }

    @Test
    void testClone() {
        try{
            controladorDeLetrasJaDigitadas = new ControladorDeLetrasJaDigitadas();
            controladorDeLetrasJaDigitadas.registre('B');
            ControladorDeLetrasJaDigitadas cloneControlador = (ControladorDeLetrasJaDigitadas) controladorDeLetrasJaDigitadas.clone();
            assertEquals(controladorDeLetrasJaDigitadas, cloneControlador);
        }catch (Exception e){}
    }

    @Test
    void testClone2() {
        try{
            controladorDeLetrasJaDigitadas = new ControladorDeLetrasJaDigitadas();
            controladorDeLetrasJaDigitadas.registre('B');
            ControladorDeLetrasJaDigitadas cloneControlador = new ControladorDeLetrasJaDigitadas(controladorDeLetrasJaDigitadas);
            assertEquals(controladorDeLetrasJaDigitadas, cloneControlador);
        }catch (Exception e){}
    }
}