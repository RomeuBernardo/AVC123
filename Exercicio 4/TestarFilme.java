/**
 *   author: Romeu Bernado
 * Esta classe é usada para testar a funcionalidade da classe Filme.
 */
public class TestarFilme{
/**
     * Método principal do programa.
     * Este método é o ponto de entrada do programa Java. Ele é chamado quando o programa é iniciado e é usado para iniciar a execução do programa.
     * @param args argumentos da linha de comando (não são usados neste programa)
     */
    public static void main(String[] args)
    {
        Filme filme1 = new Filme();
        filme1.setTitulo("Vingadores");
        filme1.setDuracaoEmMinutos(142);
        filme1.exibirDuracaoEmHoras();
        System.out.println("=========================");
        Filme filme2 = new Filme();
        filme2.setTitulo("Hotel Transilvania");
        filme2.setDuracaoEmMinutos(93);
        filme2.exibirDuracaoEmHoras();

        System.out.println("Os filmes em cartaz são:" + filme1.getTitulo() + " e " + filme2.getTitulo() + "\n");
       
        System.out.println("=========================");
        Filme filme3 = new Filme();
        filme3.setTitulo("Velocidade Furiosa");
        filme3.setDuracaoEmMinutos(120);
        filme3.exibirDuracaoEmHoras();

        System.out.println("=========================");
        Filme filme4 = new Filme();
        filme4.setTitulo("Academia da Policia");
        filme4.setDuracaoEmMinutos(130);
        filme4.exibirDuracaoEmHoras();

        System.out.println("=========================");
        Filme filme5 = new Filme();
        filme5.setTitulo("The Flash");
        filme5.setDuracaoEmMinutos(30);
        filme5.exibirDuracaoEmHoras();
         
        System.out.println("=========================");
        Filme filme6 = new Filme();
        filme6.setTitulo("Spider Man");
        filme6.setDuracaoEmMinutos(100);
        filme6.exibirDuracaoEmHoras();

        System.out.println("=========================");
        Filme filme7 = new Filme();
        filme7.setTitulo("Super Man");
        filme7.setDuracaoEmMinutos(40);
        filme7.exibirDuracaoEmHoras();


    }
}
