package codecrushermountaincasino;

/**
 * Created by Taylor on 1/30/16.
 */
public class Card {

    private Rank rank;
    private Suit suit;
    private int rankAsInt;
    private int suitAsInt;


    public Card(Rank rank, Suit suit){

    }

    public enum Rank{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    public enum Suit{
        CLUBS, DIAMONDS, HEARTS, SPADES
    }
}
