package codecrushermountaincasino;

/**
 * Created by Taylor on 1/30/16.
 */
public class Game {
    private boolean inPlay;
    protected Player player;
    private int turn;

    public Game(Player player) {

        this.player = player;
    }

    public boolean getInPlay() {
        return inPlay;
    }

    public Player getPlayer() {
        return player;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int playersTurn) {
        turn = playersTurn;
    }

    public void toggleInPlay() {
        inPlay = !inPlay;
    }

    public void payout(int amount, Player winner) {
        winner.addChips(amount);
    }
}
