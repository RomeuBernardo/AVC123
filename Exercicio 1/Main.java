import java.util.Scanner;
/**
 *   author: Romeu Bernado
 * Classe principal que permite ao usuário inserir informações pessoais para calcular a frequência cardíaca máxima.
 */
public class Main {
 /**
     * Método principal que solicita as informações pessoais e calcula a frequência cardíaca máxima.
     * @param args argumentos da linha de comando (não são usados neste programa)
     */
    public static void main(String[] args)
    {
        
        Scanner _scanner = new Scanner (System.in);
                // Solicita ao usuário para inserir seu nome, sobrenome, dia de nascimento, mês e ano
        System.out.println("Digite o seu nome \n Digite o seu sobrenome \n Digite o seu dia de nascimento \n Digite o seu  Mês \n Digite o seu Ano \n  ");
        String nome = _scanner.nextLine();
        String sobrenome = _scanner.nextLine();
        int dia = _scanner.nextInt();
        if(dia <= 0 || dia >= 31) System.out.println("O dia não pode ser negativo e nem maior que 31 \n");
        String mes = _scanner.next();
        int ano = _scanner.nextInt();
        if(ano <= 0)System.out.println("Ano Invalido \n");
                // Cria um objeto HeartRates com as informações fornecidas
        HeartRates _heartRates = new HeartRates(nome, sobrenome, dia, mes, ano);
                // Imprime todas as informações sobre a frequência cardíaca
        _heartRates.imprimirTudo();

    }
}
