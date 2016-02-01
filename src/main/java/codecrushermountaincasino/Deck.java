package codecrushermountaincasino;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/**
 * Created by Taylor on 1/30/16.
 */
public class Deck {
    private ArrayList<Card> deck;
    private ArrayList<String> cardArtKeys;
    private int cardCount;
    private static final int DECK_SIZE = 52;

    public Deck(){
        cardArtKeys = new ArrayList<String>();
        fillDeck();
        cardArtKeys = fillCardArtKeys();
        shuffle();

    }

    private void fillDeck() {


        deck = new ArrayList<Card>();
        for (int i = 0; i <= 12; i++) {
            for (int j = 0; j <= 3; j++) {

                deck.add(new Card(i, j));
                cardCount++;
            }
        }
    }


    private void shuffle(){
        Collections.shuffle(deck);
    }

    public ArrayList<String> getCardArtKeys() {
        return cardArtKeys;
    }

    public int getCardCount(){
        return cardCount;
    }


    public ArrayList<Card> getDeck(){
        return deck;
    }





    public Card dealCardOffTop() {
        if(cardCount > 0){
            cardCount--;
            return deck.remove(0); // indicates a single Card object in an array.
        } else {
            fillDeck();
            shuffle();
            return dealCardOffTop();
        }
    }

    public Card[] dealNCards(int numOfCards) {
        Card[] cards = new Card[numOfCards]; // must make array first
        for (int i = 0; i < numOfCards; i++) {
            cards[i] = dealCardOffTop();  // call this method for each position
        }
        return cards;
    }

    @Override
    public String toString(){
        String[] deckStrings = new String[deck.size()];
        for(int i = 0; i < deck.size(); i++){

            deckStrings[i] = deck.get(i).toString(); // set each position of the String array to each single card object
                //calls card toString method on each card object

        }
        return Arrays.toString(deckStrings); // Arrays toString method
    }

    public void showDeck(){
        System.out.println(this);
    }

    private ArrayList<String> fillCardArtKeys() {
        return null;
    }

/*
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.showDeck();
        deck.showDeck();
    }
*/
}
