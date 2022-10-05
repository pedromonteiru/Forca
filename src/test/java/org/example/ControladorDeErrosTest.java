package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControladorDeErrosTest {


    ControladorDeErros controladorDeErros;


    @Test
    void registreUmErro() throws Exception {
        controladorDeErros = new ControladorDeErros(5);
        controladorDeErros.registreUmErro();
        assertEquals(controladorDeErros.toString(), "1/5");
    }

    @Test
    void registreUmErro2() throws Exception {
        try{
        controladorDeErros = new ControladorDeErros(2);
        controladorDeErros.registreUmErro();
        controladorDeErros.registreUmErro();
        controladorDeErros.registreUmErro();}
        catch(Exception e){
            System.out.println(e.getMessage().equals("Quantidade de erros superiores ao máximo"));
        }
    }

    @Test
    void isAtingidoMaximoDeErros() throws Exception {
        controladorDeErros = new ControladorDeErros(2);
        controladorDeErros.registreUmErro();
        System.out.println(controladorDeErros.isAtingidoMaximoDeErros());
        controladorDeErros.registreUmErro();
        System.out.println(controladorDeErros.isAtingidoMaximoDeErros());
    }

    @Test
    void testToString()throws Exception {
        controladorDeErros = new ControladorDeErros(4);
        System.out.println(controladorDeErros.toString());
        controladorDeErros.registreUmErro();
        System.out.println(controladorDeErros.toString());
        controladorDeErros.registreUmErro();
        System.out.println(controladorDeErros.toString());
        controladorDeErros.registreUmErro();
        System.out.println(controladorDeErros.toString());
        assertEquals(controladorDeErros.toString(), "3/4");
    }

    @Test
    void testEquals(){
        try{
        controladorDeErros= new ControladorDeErros(4);
        ControladorDeErros controladorDeErros2 = (ControladorDeErros) controladorDeErros.clone();
        assertTrue(controladorDeErros.equals(controladorDeErros2));}
        catch (Exception e){}
    }

    @Test
    void testHashCode() {
        try {
            controladorDeErros = new ControladorDeErros(3);
            controladorDeErros.registreUmErro();
            assertEquals(controladorDeErros.hashCode(), 3903);
        } catch (Exception e) {}
    }

    @Test
    void testClone() {
        try {
            controladorDeErros = new ControladorDeErros(2);
            ControladorDeErros erroToTest= new ControladorDeErros(controladorDeErros);
            assertEquals(controladorDeErros, erroToTest);
        } catch (Exception e) {}
    }

    @Test
    void testClone2() {
        try {
            controladorDeErros = new ControladorDeErros(2);
            ControladorDeErros erroToTest= (ControladorDeErros) controladorDeErros.clone();
            assertEquals(controladorDeErros, erroToTest);
        } catch (Exception e) {}
    }
}