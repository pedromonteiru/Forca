package org.example;

public class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String texto) throws Exception
    {
        if(this.texto.isEmpty()) throw new Exception("Insira um caracter");
        this.texto = texto;
        // verifica se o texto recebido é nulo ou então vazio,
        // ou seja, sem nenhum caractere, lançando exceção.
        // armazena o texto recebido em this.texto.
    }

    public int getQuantidade (char letra)
    {
        int counter = 0;
        for(int i=0; i<this.texto.length();i++){
            if(this.texto.charAt(i) == letra) counter++;
        }
        return counter;

    }

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {
        int iAux = i+1;
        int numApair = 0;
        for(int counter=0;i<this.texto.length();counter++){
            if(letra == this.texto.charAt(counter)){
                numApair++;
                if(numApair == iAux) return counter;
            }
        }
        throw new Exception("Letra não existente!");
        // se i==0, retorna a posicao em que ocorre a primeira
        // aparicao de letra fornecida em this.texto;
        // se i==1, retorna a posicao em que ocorre a segunda
        // aparicao de letra fornecida em this.texto;
        // se i==2, retorna a posicao em que ocorre a terceira
        // aparicao de letra fornecida em this.texto;
        // e assim por diante.
        // lançar excecao caso nao encontre em this.texto
        // a Iézima aparição da letra fornecida.
    }

    public int getTamanho ()
    {
        return this.texto.length();
    }

    public String toString ()
    {
        return this.texto;
    }

    public boolean equals (Object obj)
    {
        if(this.texto.equals(obj)) return true;
        return false;
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
//        this.texto.hashCode();
        // calcular e retornar o hashcode de this
        return 0;
    }
    public int compareTo (Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}
