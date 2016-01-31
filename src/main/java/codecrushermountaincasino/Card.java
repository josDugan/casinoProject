package codecrushermountaincasino;

/**
 * Created by Taylor on 1/30/16.
 */
public class Card implements Comparable<Card> {

    private Rank rank;
    private Suit suit;
    private int rankAsInt;
    private int suitAsInt;


    public Card(Rank rank, Suit suit) {

        this.rank = rank;
        this.suit = suit;


    }

    public Card(int rankAsInt, int suitAsInt) {

    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getRankAsInt() {
        return rankAsInt;
    }

    public int getSuitAsInt() {
        return suitAsInt;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + " " + suit;
    }

    public void showCard() {
    }

    public int compareTo(Card o) {
        if (this.getRank().ordinal() < o.getRank().ordinal()) {
            return -1;
        } else if (this.getRank().ordinal() > o.getRank().ordinal()) {
            return 1;
        } else {
            return 0;
        }
    }


    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }
}
