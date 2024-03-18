/**
  * author: Romeu Bernardo
 * Representa um gênio mal-humorado que concede apenas o primeiro desejo.
 */
public class GrumpyGenie extends Genie {

    /**
     * Construtor padrão da classe GrumpyGenie.
     */
    public GrumpyGenie() {
        super();
    }

    /**
     * Concede um desejo.
     * @return true se o desejo foi concedido, false caso contrário.
     */
    @Override
    public boolean grantWish() {
        if (getGrantedWishes() == 0) {
            grantedWishes++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Obtém uma representação em string do gênio.
     * @return A representação em string do gênio.
     */
    @Override
    public String toString() {
        if (getGrantedWishes() == 0) {
            return "Gênio mal-humorado tem um desejo para conceder.";
        } else {
            return "Gênio mal-humorado já concedeu um desejo.";
        }
    }
}
