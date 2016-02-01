package codecrushermountaincasino;

import org.junit.Test;

import java.util.Collections;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by lucky on 1/31/16.
 */
public class PokerTest {



    @Test
    public void testHandEvaluator(){

        Card card1 = new Card(Card.Rank.ACE, Card.Suit.CLUBS);

        Card card3 = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
        Card card4 = new Card(Card.Rank.EIGHT, Card.Suit.DIAMONDS);

        Card card2 = new Card(Card.Rank.ACE, Card.Suit.DIAMONDS);

        Card card5 = new Card(Card.Rank.EIGHT, Card.Suit.HEARTS);

        Hand hand1 =new Hand();
        hand1.addCard(card1);

        hand1.addCard(card3);

        hand1.addCard(card2);

        hand1.addCard(card4);
        hand1.addCard(card5);

        Collections.sort(hand1.getHand());

        System.out.println(hand1.getHand());

        assertEquals("This should be a full house", 7, HandEvaluator.evaluateHand(hand1.getHand()));

    }


}


