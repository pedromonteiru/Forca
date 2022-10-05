package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
        if(qtd<=0) throw new Exception("Tamanho incorreto!");
        this.texto = new char[qtd];
        for(int i=0; i<qtd;i++){
            this.texto[i]= '_';
        }
    }

    public void revele (int posicao, char letra) throws Exception
    {
        if(posicao>= this.texto.length || posicao<0) throw new Exception ("Não existente!");
        this.texto[posicao] = letra;
		// verifica se posicao é negativa ou então igual ou maior
		// do que this.texto.length, lançando uma exceção.
		// armazena a letra fornecida na posicao tambem fornecida
		// do vetor this.texto
    }

    public boolean isAindaComTracinhos ()
    {
        for(int i=0;i<this.texto.length;i++){
            if(this.texto[i] == '_'){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString ()
    {
        StringBuffer palavra = new StringBuffer();
        for(int i=0;i<this.texto.length;i++){
            palavra.append(this.texto[i]);
        }
        return palavra.toString();
    }

    @Override
    public boolean equals (Object obj) {
        if(this==obj) return true;
        if(obj==null) return false;

        if(this.getClass() != obj.getClass()) return false;
        Tracinhos control= (Tracinhos) obj;

        return Arrays.equals(this.texto, control.texto);
    }

    @Override
    public int hashCode () {
        // calcular e retornar o hashcode de this
        int ret = 2;

        for (int i = 0; i < this.texto.length; i++) {
            ret = 7 * ret + Character.valueOf(this.texto[i]).hashCode();
        }
        if(ret<0) ret=-ret;
        return ret;
    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de cópia
    {
        if(t == null) throw new Exception("Construtor de cópia nulo!");
        try {
            int length = t.texto.length;
            this.texto = new char[length];

            for (int i = 0; i < length; i++) {
              this.texto[i] = t.texto[i];
              }
        } catch (Exception exception) {
            throw new Exception("Erro na cópia!");
        }
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conteúdo de t.texto para this.texto
    }

    public Object clone ()
    {
        Tracinhos ret = null;
        try {
            ret = new Tracinhos(this);
        } catch (Exception e) {}
        return ret;
        // retornar uma copia de this
    }
}
