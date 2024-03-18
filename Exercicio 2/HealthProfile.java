/** 
 * author: Romeu Bernado
 * Class HeartRates Objectivo Calcular a frequência cardíaca alvo 
 */
public class HealthProfile {

    private String nome;
    private String sobrenome;
    private int dia;
    private String mes;
    private int ano;
    private String sexo;
    private double altura;
    private double peso;


     
 /**
      * Construtor da classe.
      *
      * @param nome O nome  a ser definido.
      * @param sobrenome O Sobrenome a ser definido.
      * @param dia o dia de nascimento aser definido.
      * @param mes mes de nascimento a ser definido.
      * @param ano ano de nascimento a ser definido.
      * @param sexo sexo sexo a ser definido.
      * @param altura altura ser definido.
      * @param peso peso a ser definido.
      */
      public HealthProfile(String nome, String sobrenome, int dia, String mes, int ano, String sexo, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
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

/** 
 * Define o sexo da pessoa.
 * @param sexo O sexo a ser definido.
 */
public void setSexo(String sexo) {
    this.sexo = sexo;
}

/** 
 * Obtém o sexo da pessoa.
 * @return O sexo da pessoa.
 */
public String getSexo() {
    return this.sexo;
}

/** 
 * Define a altura da pessoa.
 * @param altura A altura a ser definida.
 */
public void setAltura(double altura) {
    this.altura = altura;
}

/** 
 * Obtém a altura da pessoa.
 * @return A altura da pessoa.
 */
public double getAltura() {
    return this.altura;
}

/** 
 * Define o peso da pessoa.
 * @param peso O peso a ser definido.
 */
public void setPeso(double peso) {
    this.peso = peso;
}

/** 
 * Obtém o peso da pessoa.
 * @return O peso da pessoa.
 */
public double getPeso() {
    return this.peso;
}

  /** Metodo Caucular a Idade
   * @return retornar a idade
   */
public int idade(){
    return 2024-this.ano ;
}

/** 
 *  Metodo para  caucular e retornar Frequencia Cardiaca Maxima
 * @return retornar a Frequencia Cardiaca Maxima
 */
public int caucularFrequenciaCardiacaMaxima()
{
    return 220 - this.idade();
}

/** Metodo para caucular  e retornar a Frequencia Cardiaca Alvo da Pessoa
*@return retornar a Frequencia Cardiaca Alvo
 */
 public String caucularFrequenciaCardiacaAlvoDaPessoa()
{
    return "Frequencia Cardiaca Alvo de :"+ this.caucularFrequenciaCardiacaMaxima() * 0.5+ " à " + this.caucularFrequenciaCardiacaMaxima() * 8.5;
}

/**  Metodo para caucular  e retornar a indice de massa corporal
*@return retornar o indice de massa corporal
 */
public double caucularIndiceDeMassaCorporal()
{
    return this.peso/(this.altura*this.altura);
}
  /**
     *  Metodo para Imprimir tudo */
    public void imprimirTudo()
    {
        System.out.println("\n O nome é: " + this.nome + "\n O Sobrenome é: " + this.sobrenome + "\nData de nascimento : " + this.dia + "/" + this.mes + "/" + this.ano + "\n Idade é:" + this.idade() + "\n A Frequencia Cardiaca Maxima é: " + this.caucularFrequenciaCardiacaMaxima() + "\n" + this.caucularFrequenciaCardiacaAlvoDaPessoa() + "\n O sexo é: " + this.sexo + "\n Altura é :" + this.altura +"metros" +  "\n Peso é :" + this.peso +"quilogramas" + "\n O Indice de massa Corporal é:" + this.caucularIndiceDeMassaCorporal());
    }


}
