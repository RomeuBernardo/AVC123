import java.util.Scanner;
/**
 *   author: Romeu Bernado
 * Classe principal para solicitar informações pessoais e calcular a saúde com base nelas.
 */
public class Main {
/**
     * Método principal do programa.
     * Este método é o ponto de entrada do programa Java. Ele é chamado quando o programa é iniciado e é usado para iniciar a execução do programa.
     * @param args argumentos da linha de comando (não são usados neste programa)
     */
    public static void main(String[] args)
    {
        
        Scanner _scanner = new Scanner (System.in);
                    // Solicita ao usuário para inserir seu nome, sobrenome, dia de nascimento, mês e ano
        System.out.println("Digite o seu nome \n Digite o seu sobrenome \n Digite o seu dia de nascimento \n Digite o seu  Mês \n Digite o seu Ano \n Digite o seu Sexo (M/F) \n Digite a sua altura \n Digite o seu Peso \n");
        String nome = _scanner.nextLine();
        String sobrenome = _scanner.nextLine();
        int dia = _scanner.nextInt();
        if(dia <= 0 || dia >= 31) System.out.println("O dia não pode ser negativo e nem maior que 31 \n");
        String mes = _scanner.next();
        int ano = _scanner.nextInt();
        if(ano <= 0)System.out.println("Ano Invalido \n");
        String sexo = _scanner.next();
        //if(sexo != "M" || sexo != "F")System.out.println("Sexo Invalido \n");
        double altura = _scanner.nextDouble();
        double peso = _scanner.nextDouble();
                        // Cria um objeto HealthProfile com as informações fornecidas
        HealthProfile _healthProfile = new HealthProfile(nome, sobrenome, dia, mes, ano,sexo,altura,peso);
                        // Imprime todas as informações sobre a frequência cardíaca
        _healthProfile.imprimirTudo();

    }
}
