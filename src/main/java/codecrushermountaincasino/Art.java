package codecrushermountaincasino;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by joseph on 2/1/16.
 */
public class Art {

    public final static String[] SATURN;
    public final static String[] LAZERGUN;
    public final static String[] SPACESHIP;
    public final static String[] QUEEN_OF_DIAMONDS;
    public final static int ARRAY_LENGTH = 13;
    private HashMap<String, String[]> slotArt;
    private HashMap<String, String[]> cardArt;

    static {
        SATURN = new String[]{
                " _________________________ ",
                "|         *               |",
                "|    '        __      .: .|",
                "|  .     ,MMM8&&&.:'   .' |",
                "|       MMMMMoooo&&  .:'  |",
                "|      MMMMMooo.o&&&:'    |",
                "|      MOOooo::..o&&      |",
                "|    .:MOOOooo...o&&   .  |",
                "|  .:'  MMOOOooo&&&       |",
                "| :'   .:'MMM8&&&'        |",
                "|.':' `    .           *  |",
                "|     .          ,        |",
                "|_________________________|"};

        LAZERGUN = new String[]{
                " _________________________ ",
                "|                         |",
                "|                         |",
                "|                         |",
                "| >.---...________.>  zzz |",
                "|  \\\\ oo ;i:__,---] zzzZZZ|",
                "|   >,C_c)              zz|",
                "|  /x//                   |",
                "| /uu}                    |",
                "| ```'                    |",
                "|                         |",
                "|                         |",
                "|_________________________|"};

        SPACESHIP = new String[]{
                " _________________________ ",
                "|                         |",
                "|            |            |",
                "|         .-\"^\"-.         |",
                "|        /_....._\\        |",
                "|    .-\"`         `\"-.    |",
                "|   (-  =o= =o= =o=  -)   |",
                "|    '-.,000000000,.-'    |",
                "|        /       \\        |",
                "|       /         \\       |",
                "|     _/           \\_     |",
                "|    `\"`           `\"`    |",
                "|_________________________|"};

        QUEEN_OF_DIAMONDS = new String[]{
                " _________________ ",
                "|                 |",
                "|  Q          /\\  |",
                "|             \\/  |",
                "|    _|\\/\\/|_     |",
                "|   /oo    oo\\    |",
                "|  (OOOO  OOOO)   |",
                "|   \\OOO  OOO/    |",
                "|    \\  __  /     |",
                "|     \\.  ,/      |",
                "|       \'\' o 0 o  |",
                "|           \\\\|/   |",
                "|  /\\             |",
                "|  \\/           O |",
                "|_________________|",};


    }

    public Art() {
        assignSlotArt();
    }





    public void assignSlotArt() {
        slotArt = new HashMap<String, String[]>();
        slotArt.put("0", SATURN);
        slotArt.put("1", LAZERGUN);
        slotArt.put("2", SPACESHIP);
    }

    public ArrayList<String[]> loadPaylineArt(String[] payLine) {
        ArrayList<String[]> artArray = new ArrayList<String[]>();
        for (String slot : payLine) {
            artArray.add(slotArt.get(slot));
        }

        return artArray;
    }

    private ArrayList<String[]> test = new ArrayList<String[]>(Arrays.asList(SATURN, LAZERGUN, SPACESHIP));



    public void processASCIIArt(ArrayList<String[]> artArray) {
        int arrayIdx = 0;
        while (arrayIdx < ARRAY_LENGTH) {
            StringBuilder sb = new StringBuilder();
            for (String[] array: artArray) {
                sb.append(array[arrayIdx] + "     ");
            }
            System.out.println(sb.toString());
            arrayIdx++;
        }
    }



/*
    public void processASCIIArt() {
        int arrayIdx = 0;
        while (arrayIdx < ARRAY_LENGTH) {
            StringBuilder sb = new StringBuilder();
            for (String[] array : test) {

                sb.append(array[arrayIdx] + "     ");
            }
            System.out.println(sb.toString());
            arrayIdx++;
        }
    }*/
/*
    public static void main(String[] args) {
        Art obj = new Art();
        System.out.println(obj.test.get(0).toString());
        obj.processASCIIArt();

    }
 */
}
