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

    public Card(int rankAsInt, int suitAsInt){
    }

    public Rank getRank(){
        return rank;
    }

    public Suit getSuit(){
        return suit;
    }

    public int getRankAsInt(){
        return rankAsInt;
    }

    public int getSuitAsInt(){
        return suitAsInt;
    }

    public void setRank(Rank rank){
        this.rank = rank;
    }

    public void setSuit(Suit suit){
        this.suit = suit;
    }

    @Override
    public String toString(){  //regular toString refers to the reference.

        return "rank: " + rank + "suit: " + suit;
    }

    public void showCard(){
        System.out.println(this); //this refers to class(itself) any time you refer to variable, compiler looks for toString
    }


    public enum Rank{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    public enum Suit{
        CLUBS, DIAMONDS, HEARTS, SPADES
    }
}
