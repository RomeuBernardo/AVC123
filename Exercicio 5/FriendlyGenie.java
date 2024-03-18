/**
 * author: Romeu Bernardo
 * Representa um gênio bem-humorado que concede desejos.
 */
public class FriendlyGenie extends Genie {
    private int desejosRestantes; // quantidade de desejos restantes para conceder

    /**
     * Construtor da classe FriendlyGenie.
     * @param numDesejos O número total de desejos que o gênio pode conceder.
     */
    public FriendlyGenie(int numDesejos) {
        super();
        this.desejosRestantes = numDesejos;
    }

    /**
     * Concede um desejo.
     * @return true se o desejo foi concedido, false caso contrário.
     */
    @Override
    public boolean grantWish() {
        if (desejosRestantes > 0) {
            grantedWishes++;
            desejosRestantes--;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Obtém a quantidade de desejos restantes que o gênio pode conceder.
     * @return A quantidade de desejos restantes.
     */
    public int getDesejosRestantes() {
        return desejosRestantes;
    }

    /**
     * Obtém uma representação em string do gênio.
     * @return A representação em string do gênio.
     */
    @Override
    public String toString() {
        return "Gênio amigável concedeu " + grantedWishes + " desejos e ainda tem " + desejosRestantes + " para conceder.";
    }
}

