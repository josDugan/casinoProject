package codecrushermountaincasino;

import java.util.ArrayList;

/**
 * Created by Taylor on 1/30/16.
 */
public class Hand {
    private ArrayList<Card> hand;
    private int cardCount;
    private int maxCards;
<<<<<<< HEAD

    //public Hand(int MaxCards, Card... hand){
    //}

=======
/*
    public Hand(int MaxCards, Card... hand){
    }
*/
>>>>>>> fa67c912e4e4a3d01b1f327cbcfcc02ab7f8e065
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
    }

    public Card removeCard(Card card){
        return card;
    }

    public Card removeCard(int cardIndex){
        return null;
    }

    @Override
    public String toString(){
        return null;
    }

    public void showCards(){
    }


}
