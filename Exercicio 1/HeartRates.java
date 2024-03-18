/** 
 * author: Romeu Bernado
 * Class HeartRates Objectivo Calcular a frequência cardíaca alvo 
 */
public class HeartRates
{
    
   private String nome;
   private String sobrenome;
   private int dia;
   
   private String mes;
   private int ano;
    
/**
     * Construtor da classe.
     *
     * @param nome O nome .
     * @param sobrenome O Sobrenome.
     * @param dia o dia de nascimento.
     * @param mes mes de nascimento
     * @param ano ano de nascimento
     */
    public HeartRates(String nome, String sobrenome, int dia, String mes, int ano)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    /** 
 * Define o nome da pessoa.
 * @param nome O nome a ser definido.
 */
public void setNome(String nome) {
    this.nome = nome;
}

/** 
 * Obtém o nome da pessoa.
 * @return O nome da pessoa.
 */
public String getNome() {
    return this.nome;
}

/** 
 * Define o sobrenome da pessoa.
 * @param sobrenome O sobrenome a ser definido.
 */
public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
}

/** 
 * Obtém o sobrenome da pessoa.
 * @return O sobrenome da pessoa.
 */
public String getSobrenome() {
    return this.sobrenome;
}

/** 
 * Define o dia de nascimento da pessoa.
 * @param dia O dia de nascimento a ser definido.
 */
public void setDia(int dia) {
    this.dia = dia;
}

/** 
 * Obtém o dia de nascimento da pessoa.
 * @return O dia de nascimento da pessoa.
 */
public int getDia() {
    return this.dia;
}

/** 
 * Define o mês de nascimento da pessoa.
 * @param mes O mês de nascimento a ser definido.
 */
public void setMes(String mes) {
    this.mes = mes;
}

/** 
 * Obtém o mês de nascimento da pessoa.
 * @return O mês de nascimento da pessoa.
 */
public String getMes() {
    return this.mes;
}

/** 
 * Define o ano de nascimento da pessoa.
 * @param ano O ano de nascimento a ser definido.
 */
public void setAno(int ano) {
    this.ano = ano;
}

/** 
 * Obtém o ano de nascimento da pessoa.
 * @return O ano de nascimento da pessoa.
 */
public int getAno() {
    return this.ano;
}


    /** Metodo Caucular a Idade
     *@return retornar a idade
     */
    public int idade(){
        return 2024-this.ano ;
    }

    /** 
     * Metodo para  caucular e retornar Frequencia Cardiaca Maxima
     * @return retornar a Frequencia Cardiaca Maxima
     */
    public int caucularFrequenciaCardiacaMaxima()
    {
        return 220 - this.idade();
    }

        
    /** Caucular Metodo para caucular  e retornar a Frequencia Cardiaca Alvo da Pessoa
     *@return retornar a Frequencia Cardiaca Alvo
    */
    public String caucularFrequenciaCardiacaAlvoDaPessoa()
    {
        return "Frequencia Cardiaca Alvo de :"+ this.caucularFrequenciaCardiacaMaxima() * 0.5+ " à " + this.caucularFrequenciaCardiacaMaxima() * 8.5;
    }

    /**
     *  Metodo para Imprimir tudo */
    public void imprimirTudo()
    {
        System.out.println("\n O nome é: " + this.nome + "\n O Sobrenome é: " + this.sobrenome + "\nData de nascimento : " + this.dia + "/" + this.mes + "/" + this.ano + "\n Idade é:" + this.idade() + "\n A Frequencia Cardiaca Maxima é: " + this.caucularFrequenciaCardiacaMaxima() + "\n" + this.caucularFrequenciaCardiacaAlvoDaPessoa());
    }

}   
