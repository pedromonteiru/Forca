package org.example;

public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        this.letrasJaDigitadas = "";
        // torna this.letrasJaDigitadas igual ao String vazio
    }

    public boolean isJaDigitada (char letra)
    {
        for(int i=0;i<this.letrasJaDigitadas.length(); i++){
            if(letra == this.letrasJaDigitadas.charAt(i)) return true;
        }
        return false;
        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
    }

    public void registre (char letra) throws Exception
    {
        if(this.isJaDigitada(letra)) throw new Exception("Letra ja digitada!");
//        this.letrasJaDigitadas = this.letrasJaDigitadas + letra;
        this.letrasJaDigitadas = this.letrasJaDigitadas + letra;
		// verifica se a letra fornecida ja foi digitada (pode usar
		// o método this.isJaDigitada, para isso), lancando uma exceção
		// em caso afirmativo.
		// concatena a letra fornecida a this.letrasJaDigitadas.
    }
    @Override
    public String toString ()
    {
        StringBuffer letrasDigitadas = new StringBuffer();
        String Virgle = ", ";
        for(int i=0;i<this.letrasJaDigitadas.length();i++){
            letrasDigitadas.append(this.letrasJaDigitadas.charAt(i));
            if(this.letrasJaDigitadas.length()-1 == i) Virgle = "";
            letrasDigitadas.append(Virgle);
        }
        return letrasJaDigitadas;
		// retorna um String com TODAS as letras presentes em
		// this.letrasJaDigitadas separadas por vírgula (,).
    }
    @Override
    public boolean equals (Object obj)
    {
        // verificar se this e obj são iguais
        if(this==obj) return true;
        if(obj==null) return false;

        if(this.getClass() != obj.getClass()) return false;
        ControladorDeLetrasJaDigitadas control = (ControladorDeLetrasJaDigitadas) obj;

        if(this.letrasJaDigitadas != control.letrasJaDigitadas) return false;

        return true;
    }
    @Override
    public int hashCode ()
    {
        int ret = 2403;

        ret = 13*ret+ new String(this.letrasJaDigitadas).hashCode();
        if(ret<0) ret=-ret;

        return ret;
    }

    public ControladorDeLetrasJaDigitadas(
    ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
    throws Exception // construtor de cópia
    {
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
        if(controladorDeLetrasJaDigitadas == null) throw new Exception("Construtor de cópia nulo!");
        this.letrasJaDigitadas = controladorDeLetrasJaDigitadas.letrasJaDigitadas;
    }

    public Object clone ()
    {
        ControladorDeLetrasJaDigitadas ret = null;
        try {
            ret= new ControladorDeLetrasJaDigitadas(this);
        }catch (Exception e){}

        return ret;
        // criar uma cópia do this com o construtor de cópia e retornar
    }
}
