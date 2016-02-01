package codecrushermountaincasino;

/**
 * Created by Joseph Dugan on 1/30/16.
 */
public class Player {
    private String name;
    private int chips;
    private int score;

    public Player(String name) {
        this.name = name;
        chips = 100;
        score = 0;
    }

    public String getName() {
        return name;
    }

    public int getChips() {
        return chips;
    }

    public int getScore() {
        return score;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {this.name = name;}



    public int addChips(int newChipValue) {
       chips += newChipValue;
        return newChipValue;
    }

    public int removeChips(int chips) {
        this.chips -= chips;
        return chips;
    }

    public int addScore(int score) {
        this.score += score;
        return score;
    }

    public int placeBet(int chips) {
        removeChips(chips);
        return chips;
    }

    @Override
    public String toString() {
        String playerObject = "Name: " + name + "\nLorps: " + chips + "\nScore: " + score;

        return playerObject;
    }

    public void print() {
        System.out.println(this);
    }
}
