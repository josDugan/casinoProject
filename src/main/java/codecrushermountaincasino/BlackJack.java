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
        playerHand = new Hand();
        computerHand = new Hand();
        continueGame = true;
    }

    public void playBlackJack() {
        System.out.println("Welcome to Blackjack!");

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
    }
}
