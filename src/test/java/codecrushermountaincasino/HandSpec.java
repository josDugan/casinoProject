package codecrushermountaincasino;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Stella on 1/30/16.
 */

public class HandSpec {
    private Card queenOfHearts = new Card(Card.Rank.QUEEN, Card.Suit.HEARTS);
    private Card kingOfHearts = new Card(Card.Rank.KING, Card.Suit.HEARTS);
    private Card jackOfHearts = new Card(Card.Rank.JACK, Card.Suit.HEARTS);

    private final static int MAXCARDS = 3;
    private Card[] cardsInHand = {queenOfHearts, kingOfHearts, jackOfHearts};
    Hand hand;

    @Before
    public void setUp() {
        //hand = new Hand(MAXCARDS, queenOfHearts, kingOfHearts, jackOfHearts);
    }


    @Test
    public void addCardTest(){
        Card kingOfSpades = new Card(Card.Rank.KING, Card.Suit.SPADES);
        int lengthOfHandsArrayBeforeAdd = hand.getHand().size();
        hand.addCard(kingOfSpades);
        int lengthOfHandsArrayAfterAdd = hand.getHand().size();
        assertEquals("Card was not added", lengthOfHandsArrayBeforeAdd+1, lengthOfHandsArrayAfterAdd);
    }

    @Test
    public void removeCardTest(){
        //find a way to check if the card has been removed from the deck
        int lengthOfHandsArrayBeforeRemoveCard = hand.getHand().size();
        hand.removeCard(kingOfHearts);
        int lengthOfHandsArrayAfterRemoveCard = hand.getHand().size();
        assertEquals("Card was not removed", lengthOfHandsArrayBeforeRemoveCard-1, lengthOfHandsArrayAfterRemoveCard);
    }

    @Test
    public void removeCardIntTest(){
        int lengthOfHandsArrayBeforeRemoveCard = hand.getHand().size();
        hand.removeCard(2);
        int lengthOfHandsArrayAfterRemoveCard = hand.getHand().size();
        assertEquals("Card was not removed", lengthOfHandsArrayBeforeRemoveCard-1, lengthOfHandsArrayAfterRemoveCard);
    }



}
