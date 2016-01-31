package codecrushermountaincasino;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Taylor on 1/31/16.
 */
public class DeckSpec {

    Deck cardDeckObj;
    Card[] numOfCards;
    Card[] cards;

    @Before
     public void assets(){

        cardDeckObj = new Deck();
        numOfCards = cardDeckObj.dealNCards(5);
        cards = new Card[5];
    }

    @Test
    public void fillDeckTest(){

        assertTrue(cardDeckObj.getDeck().remove(cardDeckObj.getDeck().size() - 1) != null);

    }

    @Test
    public void dealNCardsTest() {


        assertTrue(numOfCards.length == cards.length);
        assertTrue(numOfCards[0] != null);

    }
}
