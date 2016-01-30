package codecrushermountaincasino;

/**
 * Created by Taylor on 1/30/16.
 */
public class Game {
    private boolean inPlay;
    protected Player player;
    private Player turn;

    public Game(Player player) {
        this.player = player;
    }

    public boolean getInPlay() {
        return false;
    }

    public Player getPlayer() {
        return null;
    }

    public Player getTurn() {
        return null;
    }

    public void setTurn(Player player) {
        turn = player;
    }

    public void toggleInPlay() {

    }

    public Player determineWinner() {
        return null;
    }

    public void payout(int amount, Player winner) {

    }
}
