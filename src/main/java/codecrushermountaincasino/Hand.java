package codecrushermountaincasino;

import java.util.ArrayList;

/**
 * Created by Taylor on 1/30/16.
 */
public class Hand {
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int cardCount;
    private int maxCards;

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getMaxCards(){
        return maxCards;
    }

    public int getCardCount(){
        return cardCount;
    }

    public void addCard(Card card){

        hand.add(card);

    }

    public Card removeCard(Card card){
        return card;
    }

    public Card removeCard(int cardIndex){
        return null;
    }

    @Override
    public String toString(){
        return hand.toString();
    }

    public void showCards(){
    }


}
