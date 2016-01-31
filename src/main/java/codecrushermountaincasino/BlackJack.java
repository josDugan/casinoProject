package codecrushermountaincasino;

/**
 * Created by Taylor on 1/30/16.
 */
public class BlackJack extends CardGame{
    private Hand playerHand;
    private Hand computerHand;
    private boolean continueGame;

    public BlackJack(Player player) {
        super(player);
        playerHand = new Hand(5);
        computerHand = new Hand(5);
        continueGame = true;
    }
/*
    public void playBlackJack() {

    }

    private void setUp() {

    }

    private void endGame() {

    }

    private Card hit() {
        return null;
    }

    private boolean stand() {
        return false;
    }*/
}
