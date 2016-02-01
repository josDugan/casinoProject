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
        System.out.println("Welcome to\n  ______   __        ______    ______    ______    ______  ________   ______  \n" +
                " /      \\ |  \\      /      \\  /      \\  /      \\  /      \\|        \\ /      \\ \n" +
                "|  $$$$$$\\| $$     |  $$$$$$\\|  $$$$$$\\|  $$$$$$\\|  $$$$$$\\\\$$$$$$$$|  $$$$$$\\\n" +
                "| $$___\\$$| $$     | $$  | $$| $$ __\\$$| $$ __\\$$| $$__| $$  | $$   | $$___\\$$\n" +
                " \\$$    \\ | $$     | $$  | $$| $$|    \\| $$|    \\| $$    $$  | $$    \\$$    \\ \n" +
                " _\\$$$$$$\\| $$     | $$  | $$| $$ \\$$$$| $$ \\$$$$| $$$$$$$$  | $$    _\\$$$$$$\\\n" +
                "|  \\__| $$| $$_____| $$__/ $$| $$__| $$| $$__| $$| $$  | $$  | $$   |  \\__| $$\n" +
                " \\$$    $$| $$     \\\\$$    $$ \\$$    $$ \\$$    $$| $$  | $$  | $$    \\$$    $$\n" +
                "  \\$$$$$$  \\$$$$$$$$ \\$$$$$$   \\$$$$$$   \\$$$$$$  \\$$   \\$$   \\$$     \\$$$$$$ \nIt's 5 lorps a round.");

        while (getInPlay()) {


            Scanner scan = new Scanner(System.in);
            setInPlay(true);

            System.out.println("Press 'z' to pull the lever, human.");
            if (scan.hasNext("z")) {
                if (player.getChips() >= 5) {
                    pullLever();
                    player.removeChips(5);
                    printSlots();
                    calculateScore();
                    System.out.println("You've got " + player.getChips() + " lorps. Amazing.");

                }else if(player.getChips() < 5){
                    System.out.println("Not enough lorps. Go away.");
                    toggleInPlay();
                } else {
                    toggleInPlay();
                }

            } else {
                toggleInPlay();;
            }

        }
    }

    public void pullLever() {
        payLine = new String[3];
        for (int i = 0; i < payLine.length; i++) {
            Integer slotValue = (Integer) (int) (Math.random() * 3);
            payLine[i] = slotValue.toString(); //payline values are strings. Integers toString method

        }
    }

    public void calculateScore(){
        String firstPos = payLine[0];
        Player player = getPlayer();
        for(int i = 0; i < payLine.length; i++){
            if(firstPos.equals(payLine[1]) && firstPos.equals(payLine[2])) {
                player.addChips(50);
                System.out.println("You won 50 lorps.");
                break;
            }else if(firstPos.equals(payLine[1])) {
                player.addChips(15);
                System.out.println("You won 15 lorps.");
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




}
