import java.util.Scanner;
/**
 * Classe de teste para a classe Livro.
 * Esta classe é usada para testar a funcionalidade da classe Livro.
 * @author Romeu Bernado
 */
public class TestarLivros  {
/**
     * Método principal do programa.
     * Este método é o ponto de entrada do programa Java. Ele é chamado quando o programa é iniciado e é usado para iniciar a execução do programa.
     * @param args argumentos da linha de comando (não são usados neste programa)
     */
    public static void main(String[] args)
    {
        
        Scanner _scanner = new Scanner (System.in);

        Livro _livrofavourito  = new Livro();
        _livrofavourito.setTitulo("O Pequeno Príncipe");
        _livrofavourito.setQtdPaginas(98);
        System.out.println("O Livro  Pequeno Príncipe posui: " + _livrofavourito.getQtdPaginas() +" páginas");
        _livrofavourito.setPaginasLidas(20);
        _livrofavourito.verificarProcesso();

        _livrofavourito.setPaginasLidas(50);
        _livrofavourito.verificarProcesso();


        // Instanciando 10 livros e atribuindo-os ao vetor    
    Livro _livros[] = new Livro[10];
    _livros[0] = new Livro("Pai Rico Pai Pobre", 69, 10);
    _livros[1] = new Livro("Computacao Grafica", 70, 30);
    _livros[2] = new Livro("Comercio Electronico", 70, 30);
    _livros[3] = new Livro("FP2", 90, 30);
    _livros[4] = new Livro("Base de Dados", 80, 40);
    _livros[5] = new Livro("IHM", 90, 25);
    _livros[6] = new Livro("Sistemas de Multimedias", 95, 22);
    _livros[7] = new Livro("FP3", 100, 30);
    _livros[8] = new Livro("Algoritmo e Complexidade", 110, 50);
    _livros[9] = new Livro("Redes de computador", 120, 60);

    System.out.println("\n============================= Instanciando 10  Livros=========");
        for (int i = 0; i < 10; i++) 
            _livros[i].verificarProcesso();
        
    }
}
