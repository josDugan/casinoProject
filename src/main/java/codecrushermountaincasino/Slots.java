package codecrushermountaincasino;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Taylor on 1/30/16.
 */
public class Slots extends Game {
    private String[] payLine;
    HashMap<String,String> slotArt;
    private Art art = new Art();




    public Slots(Player player) {
        super(player); // reference the game player
        //assignSlotArt();
        slotsEngine();

    }

    public void slotsEngine() {

        while (getInPlay()) {


            Scanner scan = new Scanner(System.in);
            System.out.println("Press 'z' to pull the lever again or press anything else to leave, human.");
            if(scan.hasNext("z")){
                pullLever();
                printSlots();
                calculateScore();
            } else {
                toggleInPlay();
                System.out.println("Enjoy the rest of your stay, human");
            }

            System.out.println("You have " + player.getChips() + " lorps, human");
        }

    }

    public void pullLever() {
        payLine = new String[3];
        for (int i = 0; i < payLine.length; i++) {
            Integer slotValue = (Integer) (int) (Math.random() * 3);
            payLine[i] = slotValue.toString(); //payline values are strings.

        }
    }

    public void calculateScore(){
        String firstPos = payLine[0];
        Player player = getPlayer();
        for(int i = 0; i < payLine.length; i++){
            if(firstPos.equals(payLine[1]) && firstPos.equals(payLine[2])) {
                player.addChips(100);
                System.out.println("You won 100 lorps.");
                break;
            }else if(firstPos.equals(payLine[1]) || firstPos.equals(payLine[2])){
                player.addChips(20);
                System.out.println("You won 20 lorps.");
                break;
            } else {
                player.addChips(0);
                System.out.println("Worthless human. No lorps for you.");
                break;
            }
        }
    }
    /*
    public void assignSlotArt() {
        slotArt = new HashMap<String, String>();
        slotArt.put("0", "ufo ");
        slotArt.put("1", "laser ");
        slotArt.put("2", "saturn ");
    }*/

    public String[] getPayLine() {
        return payLine;
    }

    public void printSlots() {
        art.processASCIIArt(art.loadPaylineArt(payLine), Art.SLOT_ART_ARRAY_LENGTH);
    }

    /* Old print and toString method
    @Override
    public String toString() {
        String slotArtString = "";
        for (int i = 0; i < slotArt.size(); i++) {
            slotArtString += slotArt.get(payLine[i]); //concatenate all values in the hashmap based on positions in payline
        }
        return slotArtString;
    }

    public void printSlots() {
        System.out.println(this); //System out finds toString method.
    }*/

    // for game testing purposes

    public static void main(String[] args) {

        Player player = new Player("jangles");
        Slots slots = new Slots(player);
    }

}
