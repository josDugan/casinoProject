package codecrushermountaincasino;

import org.junit.Test;

import java.util.Collections;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by lucky on 1/31/16.
 */
public class PokerTest {



    @Test
    public void testHandEvaluator() {

        Card card1 = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
        Card card3 = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
        Card card4 = new Card(Card.Rank.EIGHT, Card.Suit.DIAMONDS);
        Card card2 = new Card(Card.Rank.ACE, Card.Suit.DIAMONDS);
        Card card5 = new Card(Card.Rank.EIGHT, Card.Suit.HEARTS);

        Hand hand1 = new Hand();
        hand1.addCard(card1);
        hand1.addCard(card3);
        hand1.addCard(card2);
        hand1.addCard(card4);
        hand1.addCard(card5);

        Collections.sort(hand1.getHand());

        assertEquals("This should be a full house", 7, HandEvaluator.evaluateHand(hand1.getHand()));


        Card card11 = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
        Card card33 = new Card(Card.Rank.TWO, Card.Suit.CLUBS);
        Card card44 = new Card(Card.Rank.EIGHT, Card.Suit.DIAMONDS);
        Card card22 = new Card(Card.Rank.SEVEN, Card.Suit.DIAMONDS);
        Card card55 = new Card(Card.Rank.THREE, Card.Suit.HEARTS);

        Hand hand2 = new Hand();
        hand2.addCard(card11);
        hand2.addCard(card33);
        hand2.addCard(card22);
        hand2.addCard(card44);
        hand2.addCard(card55);

        Collections.sort(hand2.getHand());

        assertEquals("This should be a high card",1, HandEvaluator.evaluateHand(hand2.getHand()));


        Card card111 = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
        Card card333 = new Card(Card.Rank.TWO, Card.Suit.CLUBS);
        Card card444 = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
        Card card222 = new Card(Card.Rank.SEVEN, Card.Suit.CLUBS);
        Card card555 = new Card(Card.Rank.THREE, Card.Suit.CLUBS);

        hand1 = new Hand();
        hand1.addCard(card111);
        hand1.addCard(card333);
        hand1.addCard(card222);
        hand1.addCard(card444);
        hand1.addCard(card555);

        Collections.sort(hand1.getHand());

        assertEquals("This should be a high card", 6, HandEvaluator.evaluateHand(hand1.getHand()));


        Card card1111 = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
        Card card3333 = new Card(Card.Rank.ACE, Card.Suit.HEARTS);
        Card card4444 = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
        Card card2222 = new Card(Card.Rank.SEVEN, Card.Suit.CLUBS);
        Card card5555 = new Card(Card.Rank.THREE, Card.Suit.CLUBS);

        hand1 = new Hand();
        hand1.addCard(card1111);
        hand1.addCard(card3333);
        hand1.addCard(card2222);
        hand1.addCard(card4444);
        hand1.addCard(card5555);

        Collections.sort(hand1.getHand());

        assertEquals("This should be a high card", 2, HandEvaluator.evaluateHand(hand1.getHand()));


    }
}


