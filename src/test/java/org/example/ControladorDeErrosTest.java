package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControladorDeErrosTest {


    ControladorDeErros controladorDeErros;

    @Test
    void construtorInvalido(){
        try{
            controladorDeErros = new ControladorDeErros(0);
        } catch (Exception e){
            assertEquals(e.getMessage(), "Quantidade inválida");
        }
    }

    @Test
    void construtorInvalido2(){
        try{
            ControladorDeErros controlNull = null;
            controladorDeErros = new ControladorDeErros(controlNull);
        } catch (Exception e){
            assertEquals(e.getMessage(), "Construtor de cópia nulo!");
        }
    }
    @Test
    void registreUmErro(){
        try{
        controladorDeErros = new ControladorDeErros(5);
        controladorDeErros.registreUmErro();
        assertEquals(controladorDeErros.toString(), "1/5");}
        catch (Exception e){}
    }

    @Test
    void registreUmErro2() throws Exception {
        try{
        controladorDeErros = new ControladorDeErros(2);
        controladorDeErros.registreUmErro();
        controladorDeErros.registreUmErro();
        controladorDeErros.registreUmErro();}
        catch(Exception e){
            assertEquals(e.getMessage(), "Quantidade de erros superiores ao máximo");
//            System.out.println(e.getMessage().equals("Quantidade de erros superiores ao máximo"));
        }
    }

    @Test
    void isAtingidoMaximoDeErros(){
        try {
        controladorDeErros = new ControladorDeErros(2);
        controladorDeErros.registreUmErro();
        controladorDeErros.registreUmErro();
        assertTrue(controladorDeErros.isAtingidoMaximoDeErros());
        }catch (Exception e){
        }
    }

    @Test
    void testToString() {
        try{
        controladorDeErros = new ControladorDeErros(4);
        controladorDeErros.registreUmErro();
        controladorDeErros.registreUmErro();
        controladorDeErros.registreUmErro();
        assertEquals(controladorDeErros.toString(), "3/4");}
        catch (Exception e){
            System.out.println(e.getMessage());
        }
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