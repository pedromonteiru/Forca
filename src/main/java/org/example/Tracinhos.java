package org.example;

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
                return false;
            }
        }
        return true;
    }

    public String toString ()
    {
        StringBuffer palavra = new StringBuffer();
        for(int i=0;i<this.texto.length;i++){
            palavra.append(this.texto[i]);
        }
        return palavra.toString();
    }

    public boolean equals (Object obj) {
        return this.texto.equals(obj);
    }

    public int hashCode () {
        // calcular e retornar o hashcode de this
        return 0;
    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de cópia
    {
        Tracinhos tracinhos = new Tracinhos(t.texto.length);
        this.texto = tracinhos.texto;
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conteúdo de t.texto para this.texto
    }

    public Object clone ()
    {
        try {
            Tracinhos clone = new Tracinhos(this.texto.length);
            clone.texto = this.texto;
            return clone;
        } catch (Exception e) {
            throw new RuntimeException("Tamanho invalido");
        }

        // retornar uma copia de this
    }
}
