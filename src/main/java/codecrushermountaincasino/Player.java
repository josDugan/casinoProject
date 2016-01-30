package codecrushermountaincasino;

/**
 * Created by Taylor on 1/30/16.
 */
public class Player {
    private String name;
    private int chips;
    private int score;

    public Player(String name) {
        this.name = name;
        chips = 0;
        score = 0;
    }

    public String getName() {
        return null;
    }

    public int getChips() {
        return 0;
    }

    public int getScore() {
        return 0;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int addChips(int chips) {
        this.chips += chips;
        return 0;
    }

    public int removeChips(int chips) {
        this.chips -= chips;
        return 0;
    }

    public int addScore(int score) {
        this.score += score;
        return 0;
    }

    public int placeBet(int chips) {
        return 0;
    }

    public String toString() {
        return null;
    }

    public void print() {
        System.out.println(toString());
    }
}
