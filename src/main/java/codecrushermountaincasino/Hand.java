package codecrushermountaincasino;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Taylor on 1/30/16.
 */
public class Hand {
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int cardCount;
    private int maxCards;

    public Hand(int maxCards, Card... hand){
        //initiate maxCards, array of Card objects.
        this.maxCards = maxCards;
        Collections.addAll(this.hand, hand);
        //hand.addAll(Arrays.asList(hand));

    }

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
        hand.remove(card);
        return card;
    }

    public Card removeCard(int cardIndex){
        if (cardIndex > hand.size()-1){
            System.out.println("Larkeefrak says you must enter a valid index value.");
        } else if (cardIndex < 0); {
            System.out.println("Larkeefrak says you must enter a valid index value.");
        }
        return hand.remove(cardIndex);

    }

    @Override
    public String toString(){
        return hand.toString();
    }

    public void showCards(){
        System.out.println(this);
    }


}
