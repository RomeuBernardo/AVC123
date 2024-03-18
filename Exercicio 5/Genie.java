
/**
 * author: Romeu Bernardo
 * Representa um génio que concede desejos.
 */
public abstract class Genie {
    protected int grantedWishes; // quantidade de desejos concedidos
    /**
 * Construtor padrão da classe Genie.
 * Inicializa a quantidade de desejos concedidos como zero.
 */
    public Genie() {
        this.grantedWishes = 0;
    }
    /**
     * Concede um desejo.
     * @return true se o desejo foi concedido, false caso contrário.
     */
    public abstract boolean grantWish();

    /**
     * Obtém a quantidade de desejos já concedidos.
     * @return A quantidade de desejos concedidos.
     */
    public int getGrantedWishes() {
        return this.grantedWishes;
    }

    /**
     * Obtém uma representação em string do génio.
     * @return A representação em string do génio.
     */
    @Override
    public abstract String toString();
}
