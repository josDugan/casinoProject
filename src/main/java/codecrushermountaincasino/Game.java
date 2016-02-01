package codecrushermountaincasino;

/**
 * Created by Taylor on 1/30/16.
 */
public class Game {
    private boolean inPlay = true;
    protected Player player;
    private Player turn;

    public Game(Player player) {
        this.player = player;
    }

    public boolean getInPlay() {
        return inPlay;
    }

    public Player getPlayer() {
        return player;
    }

    public Player getTurn() {
        return turn;
    }

    public void setTurn(Player player) {
        turn = player;
    }

    public void toggleInPlay() {
        inPlay = !inPlay;
    }

    public Player determineWinner() {
        return null;
    }

    public void payout(int amount, Player winner) {

    }
}
