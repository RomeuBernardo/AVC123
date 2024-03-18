/**
 * Representa um filme com título e duração em minutos.
 */
public class Filme {
    private String titulo;
    private int duracaoEmMinutos;
     /**
     * Construtor padrão da classe  Filme.
     * Este construtor cria um Filme sem atribuir valores específicos aos seus atributos.
     */
    public Filme() {}
    /**
     * Construtor da classe Filme.
     * @param titulo O título do filme.
     * @param duracaoEmMinutos A duração do filme em minutos.
     */
    public Filme(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    /**
     * Obtém o título do filme.
     * @return O título do filme.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o título do filme.
     * @param titulo O título do filme.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtém a duração do filme em minutos.
     * @return A duração do filme em minutos.
     */
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    /**
     * Define a duração do filme em minutos.
     * @param duracaoEmMinutos A duração do filme em minutos.
     */
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

/**
     * calcular a duracao do filme em Horas
     */
    public void exibirDuracaoEmHoras(){
            System.out.println("O filme " + this.titulo + " possui " + this.duracaoEmMinutos / 60 + " horas e " + this.duracaoEmMinutos % 60 + " minutos de duração.\n");
    }
    
}


