package codecrushermountaincasino;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by Taylor on 1/30/16.
 */
public class Hand {
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int cardCount;
    private int maxCards;
    private Art art;

    private static int numHands;
    private int id = numHands;



    public Hand(){
        numHands++;
        art = new Art();
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

    public Art getArt() {
        return art;
    }

    public void addCard(Card card){


        hand.add(card);

    }



    public void addNCards(Card... cards){


        hand.addAll(Arrays.asList(cards));
    }

    public void setHand(ArrayList<Card> cardsInHand) {
        hand = cardsInHand;
    }


    public Card removeCard(Card card){
          return (hand.remove(card)? card : null);
    }

    public boolean discardAndReplace(int index, Card newCard){
        Card tempCard = hand.get(index);
        if(hand.size()>index) {
            hand.add(index, newCard);
            return hand.remove(tempCard);
        }
        return false;

    }

    public Card removeCard(int cardIndex){
        if (cardIndex > hand.size()-1){
            System.out.println("OgNarf says you must enter a valid index value.");
        } else if (cardIndex < 0); {
            System.out.println("OgNarf says you must enter a valid index value.");
        }
        return hand.remove(cardIndex);

    }

    public int getId(){
        return id;
    }

    @Override
    public String toString(){

        String cardsInHand = "";
        for (Card card : hand) {
            cardsInHand += card.toString() + " ";
        }

        return cardsInHand;

    }

    /*
    public void showCards(){
        System.out.println(this);
    }
    */

    public void showCards() {
        art.processASCIIArt(art.loadCardArt(cardsInHandToStringArray()), Art.CARD_ART_ARRAY_LENGTH);
    }

    public String[] cardsInHandToStringArray() {
        String[] cardsStringArray = new String[hand.size()];

        for (int i = 0; i < hand.size(); i++) {
            cardsStringArray[i] = hand.get(i).toString();
        }

        return cardsStringArray;
    }


}
