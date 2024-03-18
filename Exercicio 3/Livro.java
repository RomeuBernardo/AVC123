/**
 * author: Romeu Bernado
 * A classe Livro representa um livro com título, quantidade de páginas e páginas lidas.
 */
public class Livro {
    private String titulo;
    private int qtdPaginas;
    private int paginasLidas;
    /**
     * Construtor padrão da classe Livro.
     * Este construtor cria um livro sem atribuir valores específicos aos seus atributos.
     */
    public Livro(){}
    /**
     * Construtor da classe Livro.
     * 
     * @param titulo O título do livro.
     * @param qtdPaginas A quantidade total de páginas do livro.
     * @param paginasLidas A quantidade de páginas já lidas do livro.
     */
    public Livro(String titulo, int qtdPaginas, int paginasLidas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = paginasLidas;
    }

    /**
     * Obtém o título do livro.
     * 
     * @return O título do livro.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Define o título do livro.
     * 
     * @param titulo O título do livro a ser definido.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtém a quantidade total de páginas do livro.
     * 
     * @return A quantidade total de páginas do livro.
     */
    public int getQtdPaginas() {
        return  this.qtdPaginas;
    }

    /**
     * Define a quantidade total de páginas do livro.
     * 
     * @param qtdPaginas A quantidade total de páginas do livro a ser definida.
     */
    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    /**
     * Obtém a quantidade de páginas já lidas do livro.
     * 
     * @return A quantidade de páginas já lidas do livro.
     */
    public int getPaginasLidas() {
        return this.paginasLidas;
    }

    /**
     * Define a quantidade de páginas já lidas do livro.
     * 
     * @param paginasLidas A quantidade de páginas já lidas do livro a ser definida.
     */
    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }
    /**
     * calcular a porcentagem de leitura do livro até o momento
     */
    public void verificarProcesso() { 
        System.out.println("Voce leu : "+ (double)(this.paginasLidas*100)/this.qtdPaginas + this.qtdPaginas +" % Paginas");
    } 



}
