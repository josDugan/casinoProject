package codecrushermountaincasino;

/**
 * Created by Taylor on 1/30/16.
 */
public class CardGame extends Game{
    protected Deck deck;

    public CardGame(Player player) {
        super(player);
        deck = new Deck();
    }

    public Deck getDeck() {
        return deck;
    }
}
