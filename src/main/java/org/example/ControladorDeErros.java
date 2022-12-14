package org.example;

public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
        if(qtdMax>0){
            this.qtdMax = qtdMax;
        }
        else{
            throw new Exception("Quantidade inválida");
        }
        // verifica se qtdMax fornecida não é positiva, lançando
        // uma exceção.
        // armazena qtdMax fornecida em this.qtdMax.
    }

    public void registreUmErro () throws Exception
    {
        if(this.qtdErr == this.qtdMax) throw new Exception("Quantidade de erros superiores ao máximo");
        this.qtdErr++;
        // verifica se this.qtdErr ja é igual a this.qtdMax,
        // lançando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo
    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        return  this.qtdErr == this.qtdMax;
        // returna true se this.qtdErr for igual a this.qtdMax,
        // ou então false, caso contrario.
    }
    @Override
    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }
    @Override
    public boolean equals (Object obj)
    {
        if(this==obj) return true;
        if(obj==null) return false;

        if(this.getClass() != obj.getClass()) return false;

        ControladorDeErros control = (ControladorDeErros) obj;

        if(this.qtdMax != control.qtdMax) return false;
        if(this.qtdErr != control.qtdErr) return false;

        return true;
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }
    @Override
    public int hashCode ()
    {
        int ret = 2;

        ret = 13*ret + new Integer(this.qtdErr).hashCode();
        ret = 13*ret + new Integer(this.qtdMax).hashCode();

        if(ret<0) ret = -ret;

        return ret;
        // calcular e retornar o hashcode de this/
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception // construtor de cópia
    {
        if(c == null) throw new Exception("Construtor de cópia nulo!");
        this.qtdMax = c.qtdMax;
        this.qtdErr = c.qtdErr;
        // copiar c.qtdMax e c.qtdErr, respectivamente em, this.qtdMax e this.qtdErr
    }

    public Object clone ()
    {
        // returnar uma cópia de this
        ControladorDeErros ret = null;
        try {
            ret = new ControladorDeErros(this);
        } catch (Exception e) {}

        return ret;
    }
}
