package codecrushermountaincasino;

/**
 * Created by Taylor on 1/30/16.
 */
public class Slots extends Game {
    private int[] payLine;

    public Slots(Player player) {
        super(player);
        payLine = new int[3];
    }

    public void pullLever() {

    }

    public int[] getPayLine() {
        return null;
    }

    public String toString() {
         return null;
    }

    public void printSlots() {
        System.out.println(toString());
    }
}
