package codecrushermountaincasino;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by joseph on 1/30/16.
 */
public class PlayerSpec {
    private final static int FIVE_CHIPS = 5;
    private final static int TEN_CHIPS = 10;

    Player player;

    @Before
    public void setUp() {
        player = new Player("evan");
    }

    @Test
    public void sanityCheck() {
        assertTrue("Check if we are in java", 5==5);
    }

    @Test
    public void playerConstructorTest() {
        assertEquals("Check initialization", 0, player.getChips());
    }

    @Test
    public void testAddMethod() {
        int returned = player.addChips(FIVE_CHIPS);

        //then
        int expected = FIVE_CHIPS;
        int actual = player.getChips();
        // check state
        assertEquals("Chips not added correctly", expected, actual);
        // check returned value
        assertEquals("Incorrect value returned", expected, returned);
    }

    @Test
    public void testAddScore() {
        int returned = player.addScore(FIVE_CHIPS);

        //then
        int expected = FIVE_CHIPS;
        int actual = player.getScore();
        // check state
        assertEquals("Chips not added correctly", expected, actual);
        // check returned value
        assertEquals("Incorrect value returned", expected, returned);
    }

    @Test
    public void testRemoveChips() {
        player.addChips(TEN_CHIPS);
        int returned = player.removeChips(FIVE_CHIPS);

        // then
        int expected = FIVE_CHIPS;
        int actual = player.getChips();
        // check state
        assertEquals("Chips not removed correctly", expected, actual);
        // check returned value
        assertEquals("Incoreect value returned", expected, returned);
    }

    @Test
    public void testPlaceBet() {
        player.addChips(TEN_CHIPS);
        int returned = player.placeBet(FIVE_CHIPS);

        // then
        int expected = FIVE_CHIPS;
        int actual = player.getChips();
        // check state
        assertEquals("Chips not removed correctly", expected, actual);
        // check returned value
        assertEquals("Incorrect value returned", expected, returned);
    }

    @After
    public void teardown() {
        player = null;
        System.out.println("Object tore down");
    }
}


