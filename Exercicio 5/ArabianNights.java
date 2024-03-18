/**
 * author: Romeu Bernardo
 * Classe principal que simula a história das Mil e Uma Noites.
 */
public class ArabianNights {

    /**
     * Método principal para execução do programa.
     * @param args Argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        // Cria uma lâmpada mágica com capacidade para 4 gênios
        MagicLamp lampada = new MagicLamp(4);

        // Esfrega 5 vezes a lâmpada, indicando os números de desejos 2, 3, 4, 5, 1
        for (int i = 0; i < 5; i++) {
            lampada.rub(i + 1);
        }

        // Invoca e imprime o resultado do método toString sobre cada um dos gênios
        for (int i = 0; i < 5; i++) {
            Genie genie = lampada.rub(i + 1);
            System.out.println(genie.toString());
        }

        // Pede um desejo a cada um dos gênios
        for (int i = 0; i < 5; i++) {
            Genie genie = lampada.rub(i + 1);
            boolean wishGranted = genie.grantWish();
            if (wishGranted) {
                System.out.println("Desejo concedido!");
            } else {
                System.out.println("Não foi possível conceder o desejo.");
            }
        }

        // Invoca e imprime o resultado do método toString sobre cada um dos gênios
        for (int i = 0; i < 5; i++) {
            Genie genie = lampada.rub(i + 1);
            System.out.println(genie.toString());
        }

        // Pede um desejo a cada um dos gênios
        for (int i = 0; i < 5; i++) {
            Genie genie = lampada.rub(i + 1);
            boolean wishGranted = genie.grantWish();
            if (wishGranted) {
                System.out.println("Desejo concedido!");
            } else {
                System.out.println("Não foi possível conceder o desejo.");
            }
        }

        // Invoca e imprime o resultado do método toString sobre cada um dos gênios
        for (int i = 0; i < 5; i++) {
            Genie genie = lampada.rub(i + 1);
            System.out.println(genie.toString());
        }

        // Coloca o demônio reciclável na lâmpada
        lampada.feedDemon();

        // Esfrega a lâmpada, indicando 7 como número de desejos
        Genie demon = lampada.rub(7);

        // Invoca e imprime o resultado do método toString sobre o gênio obtido
        System.out.println(demon.toString());
    }
}

