
/**
 * Author :Romeu Bernardo
 * Representa uma lâmpada mágica que liberta gênios quando esfregada.
 */
public class MagicLamp {
    private int maxGenies; // quantidade máxima de gênios que a lâmpada pode libertar
    private int geniesLeft; // quantidade de gênios ainda disponíveis na lâmpada
    private int demonsFed; // quantidade de demônios alimentados à lâmpada

    /**
     * Cria uma nova lâmpada mágica com a capacidade especificada para libertar gênios.
     * @param maxGenies A quantidade máxima de gênios que a lâmpada pode libertar.
     */
    public MagicLamp(int maxGenies) {
        this.maxGenies = maxGenies;
        this.geniesLeft = maxGenies;
        this.demonsFed = 0;
    }

    /**
     * Esfrega a lâmpada para libertar um gênio.
     * @param numWishes O número de desejos que se espera que o gênio realize.
     * @return O gênio libertado.
     */
    public Genie rub(int numWishes) {
        if (geniesLeft > 0) {
            if (this.geniesLeft % 2 == 0) {
                this.geniesLeft--;
                return new GrumpyGenie();
            } else {
                this.geniesLeft--;
                return new FriendlyGenie(numWishes);
            }
        } else {
            return new RecyclableDemon();
        }
    }

    /**
     * Alimenta a lâmpada com um demônio para recarregá-la.
     */
    public void feedDemon() {
        this.demonsFed++;
    }

    /**
     * Obtém a quantidade de gênios ainda disponíveis na lâmpada.
     * @return A quantidade de gênios disponíveis.
     */
    public int getGeniesLeft() {
        return this.geniesLeft;
    }

    /**
     * Obtém a quantidade de vezes que a lâmpada foi recarregada.
     * @return A quantidade de vezes que a lâmpada foi recarregada.
     */
    public int getDemonsFed() {
        return this.demonsFed;
    }

    /**
     * Compara esta lâmpada com outra.
     * @param other A outra lâmpada a ser comparada.
     * @return true se as lâmpadas são iguais, false caso contrário.
     */
    public boolean equals(MagicLamp other) {
        return this.maxGenies == other.maxGenies &&
                this.geniesLeft == other.geniesLeft &&
                this.demonsFed == other.demonsFed;
    }
}
