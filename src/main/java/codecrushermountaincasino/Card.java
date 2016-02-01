package codecrushermountaincasino;

/**
 * Created by Taylor on 1/30/16.
 */
public class Card implements Comparable<Card>{

    private Rank rank;
    private Suit suit;
    private int rankAsInt;
    private int suitAsInt;
    private boolean faceUp;
    private String id;


    public Card(Rank rank, Suit suit){
        setRank(rank);
        setSuit(suit);
        faceUp = true;

    }

    public Card(int rankAsInt, int suitAsInt){

        rank = Rank.values()[rankAsInt];
        suit =  Suit.values()[suitAsInt];


    }


    public Rank getRank(){return rank;}

    public Suit getSuit(){
        return suit;
    }

    public int getRankAsInt(){
        return rankAsInt;
    }

    public int getSuitAsInt(){
        return suitAsInt;
    }

    public boolean getFaceUp() {
        return faceUp;
    }

    public void flipCard() {
        faceUp = !faceUp;
    }

    public void setRank(Rank rank){
        this.rank = rank;
    }

    public void setSuit(Suit suit){
        this.suit = suit;
    }

    @Override
    public String toString(){  //regular toString refers to the reference.


        return rank + "_OF_" + suit + " ";

    }

    public void showCard(){
        System.out.println(this); //this refers to class(itself) any time you refer to variable, compiler looks for toString

    }

    public int compareTo(Card card2) {
        if (this.getRank().ordinal() < card2.getRank().ordinal()) {
            return -1;
        }

        else if (this.getRank().ordinal() > card2.getRank().ordinal()) {
            return 1;
        }

        else {
            return 0;
        }
    }


    public enum Rank{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    public enum Suit{
        CLUBS, DIAMONDS, HEARTS, SPADES
    }
}





