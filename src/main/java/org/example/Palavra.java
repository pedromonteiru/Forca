package org.example;

public class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String texto) throws Exception
    {
        if(texto.isEmpty()) throw new Exception("Insira um caracter");
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

    @Override
    public String toString ()
    {
        return this.texto;
    }

    @Override
    public boolean equals (Object obj)
    {
        if(this==obj) return true;
        if(obj==null) return false;

        if(this.getClass() != obj.getClass()) return false;
        Palavra control = (Palavra) obj;

        return this.texto.equals(control.texto);
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }
    @Override
    public int hashCode ()
    {
//        this.texto.hashCode();
        // calcular e retornar o hashcode de this
        int ret = 2;

        ret = 13*ret+ new String(this.texto).hashCode();

        if(ret<0)ret=-ret;

        return ret;
    }
    public int compareTo (Palavra palavra)
    {
        if(!this.texto.equals(palavra.texto)) return -10;
        return 0;
    }
}
