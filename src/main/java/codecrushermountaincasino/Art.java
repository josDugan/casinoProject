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

    public final static String[] KING_OF_DIAMONDS;
    public final static String[] QUEEN_OF_DIAMONDS;
    public final static String[] JACK_OF_DIAMONDS;
    public final static String[] TEN_OF_DIAMONDS;
    public final static String[] NINE_OF_DIAMONDS;
    public final static String[] EIGHT_OF_DIAMONDS;
    public final static String[] SEVEN_OF_DIAMONDS;
    public final static String[] SIX_OF_DIAMONDS;
    public final static String[] FIVE_OF_DIAMONDS;
    public final static String[] FOUR_OF_DIAMONDS;
    public final static String[] THREE_OF_DIAMONDS;
    public final static String[] TWO_OF_DIAMONDS;
    public final static String[] ACE_OF_DIAMONDS;
    public final static String[] KING_OF_HEARTS;
    public final static String[] QUEEN_OF_HEARTS;
    public final static String[] JACK_OF_HEARTS;
    public final static String[] TEN_OF_HEARTS;
    public final static String[] NINE_OF_HEARTS;
    public final static String[] EIGHT_OF_HEARTS;
    public final static String[] SEVEN_OF_HEARTS;
    public final static String[] SIX_OF_HEARTS;
    public final static String[] FIVE_OF_HEARTS;
    public final static String[] FOUR_OF_HEARTS;
    public final static String[] THREE_OF_HEARTS;
    public final static String[] TWO_OF_HEARTS;
    public final static String[] ACE_OF_HEARTS;
    public final static String[] KING_OF_SPADES;
    public final static String[] QUEEN_OF_SPADES;
    public final static String[] JACK_OF_SPADES;
    public final static String[] TEN_OF_SPADES;
    public final static String[] NINE_OF_SPADES;
    public final static String[] EIGHT_OF_SPADES;
    public final static String[] SEVEN_OF_SPADES;
    public final static String[] SIX_OF_SPADES;
    public final static String[] FIVE_OF_SPADES;
    public final static String[] FOUR_OF_SPADES;
    public final static String[] THREE_OF_SPADES;
    public final static String[] TWO_OF_SPADES;
    public final static String[] ACE_OF_SPADES;
    public final static String[] KING_OF_CLUBS;
    public final static String[] QUEEN_OF_CLUBS;
    public final static String[] JACK_OF_CLUBS;
    public final static String[] TEN_OF_CLUBS;
    public final static String[] NINE_OF_CLUBS;
    public final static String[] EIGHT_OF_CLUBS;
    public final static String[] SEVEN_OF_CLUBS;
    public final static String[] SIX_OF_CLUBS;
    public final static String[] FIVE_OF_CLUBS;
    public final static String[] FOUR_OF_CLUBS;
    public final static String[] THREE_OF_CLUBS;
    public final static String[] TWO_OF_CLUBS;
    public final static String[] ACE_OF_CLUBS;

    public final static int CARD_ART_ARRAY_LENGTH = 15;
    public final static int SLOT_ART_ARRAY_LENGTH = 13;

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


        ACE_OF_CLUBS = new String[]{

                " _________________ ",
                "|                 |",
                "|  A              |",
                "|                 |",
                "|                 |",
                "|       _  _      |",
                "|     _(@/\\@)_    |",
                "|    (@ \\  / @)   |",
                "|   (@___||___@)  |",
                "|        )(       |",
                "|        /\\       |",
                "|                 |",
                "|                 |",
                "|              V  |",
                "|_________________|"

        };

        ACE_OF_DIAMONDS = new String[]{

                " _________________ ",
                "|                 |",
                "|  A              |",
                "|                 |",
                "|        /\\       |",
                "|       /||\\      |",
                "|      / /\\ \\     |",
                "|     /_/  \\_\\    |",
                "|     \\ \\  / /    |",
                "|      \\ \\/ /     |",
                "|       \\||/      |",
                "|        \\/       |",
                "|                 |",
                "|              V  |",
                "|_________________|"


        };



        ACE_OF_HEARTS = new String[]{

                " _________________ ",
                "|  A              |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|    (\\/\\  /\\/)   |",
                "|     \\  YY  /    |",
                "|      \\    /     |",
                "|       \\  /      |",
                "|        \\/       |",
                "|                 |",
                "|                 |",
                "|              V  |",
                "|_________________|",



        };




        ACE_OF_SPADES = new String[]{

                " _________________ ",
                "|                 |",
                "|  A              |",
                "|                 |",
                "|        ^        |",
                "|       / \\       |",
                "|      /   \\      |",
                "|     /     \\     |",
                "|    (___ ___)    |",
                "|       /^\\       |",
                "|      /___\\      |",
                "|                 |",
                "|                 |",
                "|              V  |",
                "|_________________|",



        };



        JACK_OF_CLUBS = new String[]{

                " _________________ ",
                "|                 |",
                "|  J         (O)  |",
                "|           ()|() |",
                "|    @      @ ^   |",
                "|     \\    /      |",
                "|     o \\/ o      |",
                "|   (00o  o00)    |",
                "|    \\ 0  0 /     |",
                "|     | .. |      |",
                "|      \\VV/       |",
                "|  (O)  ^^        |",
                "| ()|()           |",
                "|   ^          [  |",
                "|_________________|",



        };




        JACK_OF_DIAMONDS = new String[]{

                " _________________ ",
                "|                 |",
                "|  J          /\\  |",
                "|             \\/  |",
                "|    @      @     |",
                "|     \\    /      |",
                "|     o \\/ o      |",
                "|   (00o  o00)    |",
                "|    \\ 0  0 /     |",
                "|     | .. |      |",
                "|      \\VV/       |",
                "|       ^^        |",
                "|  /\\             |",
                "|  \\/          [  |",
                "|_________________|",



        };




        JACK_OF_HEARTS = new String[]{

                " _________________ ",
                "|                 |",
                "|  J         (vv) |",
                "|             \\/  |",
                "|    @      @     |",
                "|     \\    /      |",
                "|     o \\/ o      |",
                "|   (00o  o00)    |",
                "|    \\ 0  0 /     |",
                "|     | .. |      |",
                "|      \\VV/       |",
                "|       ^^        |",
                "|  (vv)           |",
                "|   \\/         [  |",
                "|_________________|",



        };




        JACK_OF_SPADES = new String[]{

                " _________________ ",
                "|                 |",
                "|  J          /\\  |",
                "|            /__\\ |",
                "|    @      @ /\\  |",
                "|     \\    /      |",
                "|     o \\/ o      |",
                "|   (00o  o00)    |",
                "|    \\ 0  0 /     |",
                "|     | .. |      |",
                "|      \\VV/       |",
                "|  /\\   ^^        |",
                "| /__\\            |",
                "|  /\\          [  |",
                "|_________________|",



        };




        KING_OF_CLUBS = new String[]{

                " _________________ ",
                "|                 |",
                "|  K         (O)  |",
                "|      ^^^^ () () |",
                "|    _|\\/\\/|_ ^   |",
                "|   /oo    oo\\    |",
                "|  (OOOO  OOOO)   |",
                "|   \\OOO  OOO/    |",
                "|    |  ..  |     |",
                "|     \\vvvv/      |",
                "|      \\^^/o 0 o  |",
                "|  (O)      \\|/   |",
                "| () ()           |",
                "|   ^          >| |",
                "|_________________|",



        };



        KING_OF_DIAMONDS = new String[]{

                " _________________ ",
                "|                 |",
                "|  K          /\\  |",
                "|      ^^^^   \\/  |",
                "|    _|\\/\\/|_     |",
                "|   /oo    oo\\    |",
                "|  (OOOO  OOOO)   |",
                "|   \\OOO  OOO/    |",
                "|    |  ..  |     |",
                "|     \\vvvv/      |",
                "|      \\^^/o 0 o  |",
                "|           \\|/   |",
                "|  /\\             |",
                "|  \\/         >|  |",
                "|_________________|",




        };




        KING_OF_HEARTS = new String[]{

                " _________________ ",
                "|                 |",
                "|  K         (^^) |",
                "|      ^^^^   \\/  |",
                "|    _|\\/\\/|_     |",
                "|   /oo    oo\\    |",
                "|  (OOOO  OOOO)   |",
                "|   \\OOO  OOO/    |",
                "|    |  ..  |     |",
                "|     \\vvvv/      |",
                "|      \\^^/o 0 o  |",
                "|           \\|/   |",
                "| (^^)            |",
                "|  \\/         >|  |",
                "|_________________|",




        };




        KING_OF_SPADES = new String[]{

                " _________________ ",
                "|                 |",
                "|  K          /\\  |",
                "|      ^^^^  /__\\ |",
                "|    _|\\/\\/|_ /\\  |",
                "|   /oo    oo\\    |",
                "|  (OOOO  OOOO)   |",
                "|   \\OOO  OOO/    |",
                "|    |  ..  |     |",
                "|     \\vvvv/      |",
                "|      \\^^/o 0 o  |",
                "|  /\\       \\|/   |",
                "| /__\\            |",
                "|  /\\          >| |",
                "|_________________|",




        };




        QUEEN_OF_CLUBS = new String[]{

                " _________________ ",
                "|                 |",
                "|  Q         (O)  |",
                "|           ()|() |",
                "|    _|\\/\\/|_ ^   |",
                "|   /oo    oo\\    |",
                "|  (OOOO  OOOO)   |",
                "|   \\OOO  OOO/    |",
                "|    \\  __  /     |",
                "|     \\.  ,/      |",
                "|       '' o 0 o  |",
                "|  (O)      \\|/   |",
                "| ()|()           |",
                "|   ^          O  |",
                "|_________________|",




        };




        QUEEN_OF_SPADES = new String[]{

                " _________________ ",
                "|                 |",
                "|  Q          /\\  |",
                "|            /__\\ |",
                "|    _|\\/\\/|_ /\\  |",
                "|   /oo    oo\\    |",
                "|  (OOOO  OOOO)   |",
                "|   \\OOO  OOO/    |",
                "|    \\  __  /     |",
                "|     \\.  ,/      |",
                "|       '' o 0 o  |",
                "|  /\\       \\|/   |",
                "| /__\\            |",
                "|  /\\          O  |",
                "|_________________|",


        };




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
                "|       '' o 0 o  |",
                "|           \\|/   |",
                "|  /\\             |",
                "|  \\/           O |",
                "|_________________|",



        };



        QUEEN_OF_HEARTS = new String[]{

                " _________________ ",
                "|                 |",
                "|  Q         (^^) |",
                "|             \\/  |",
                "|    _|\\/\\/|_     |",
                "|   /oo    oo\\    |",
                "|  (OOOO  OOOO)   |",
                "|   \\OOO  OOO/    |",
                "|    \\  __  /     |",
                "|     \\.  ,/      |",
                "|       '' o 0 o  |",
                "|           \\|/   |",
                "| (^^)            |",
                "|  \\/          O  |",
                "|_________________|",




        };




        EIGHT_OF_CLUBS = new String[]{

                " _________________ ",
                "|                 |",
                "|  8              |",
                "|                 |",
                "|   @    @    @   |",
                "|  @ @  @ @  @ @  |",
                "|   ^    ^    ^   |",
                "|      @    @     |",
                "|     @ @  @ @    |",
                "|      ^    ^     |",
                "|   @    @    @   |",
                "|  @ @  @ @  @ @  |",
                "|   ^    ^    ^   |",
                "|              8  |",
                "|_________________|",


        };



        EIGHT_OF_DIAMONDS = new String[]{

                " _________________ ",
                "|                 |",
                "|  8              |",
                "|                 |",
                "|   ^    ^    ^   |",
                "|   V    V    V   |",
                "|                 |",
                "|      ^    ^     |",
                "|      V    V     |",
                "|                 |",
                "|   ^    ^    ^   |",
                "|   V    V    V   |",
                "|                 |",
                "|              8  |",
                "|_________________|",



        };



        EIGHT_OF_HEARTS = new String[]{

                " _________________ ",
                "|                 |",
                "|  8              |",
                "|                 |",
                "|   <3   <3   <3  |",
                "|                 |",
                "|                 |",
                "|      <3   <3    |",
                "|                 |",
                "|                 |",
                "|   <3   <3   <3  |",
                "|                 |",
                "|                 |",
                "|              8  |",
                "|_________________|",


        };



        EIGHT_OF_SPADES = new String[]{

                " _________________ ",
                "|                 |",
                "|  8              |",
                "|                 |",
                "|   A    A    A   |",
                "|  @ @  @ @  @ @  |",
                "|                 |",
                "|      A    A     |",
                "|     @ @  @ @    |",
                "|                 |",
                "|   A    A    A   |",
                "|  @ @  @ @  @ @  |",
                "|                 |",
                "|              8  |",
                "|_________________|",



        };



        FIVE_OF_CLUBS = new String[]{

                " _________________ ",
                "|                 |",
                "|  5              |",
                "|                 |",
                "|    @       @    |",
                "|   @ @     @ @   |",
                "|    ^   @   ^    |",
                "|       @ @       |",
                "|        ^        |",
                "|    @       @    |",
                "|   @ @     @ @   |",
                "|    ^       ^    |",
                "|                 |",
                "|              5  |",
                "|_________________|",



        };



        FIVE_OF_DIAMONDS = new String[]{

                " _________________ ",
                "|                 |",
                "|  5              |",
                "|                 |",
                "|    ^       ^    |",
                "|    V       V    |",
                "|        ^        |",
                "|        V        |",
                "|                 |",
                "|    ^       ^    |",
                "|    V       V    |",
                "|                 |",
                "|                 |",
                "|              5  |",
                "|_________________|",



        };



        FIVE_OF_HEARTS = new String[]{

                " _________________ ",
                "|                 |",
                "|  5              |",
                "|                 |",
                "|    <3      <3   |",
                "|                 |",
                "|        <3       |",
                "|                 |",
                "|                 |",
                "|    <3      <3   |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|              5  |",
                "|_________________|",



        };



        FIVE_OF_SPADES = new String[]{

                " _________________ ",
                "|                 |",
                "|  5              |",
                "|                 |",
                "|    A       A    |",
                "|   @ @     @ @   |",
                "|        A        |",
                "|       @ @       |",
                "|                 |",
                "|    A       A    |",
                "|   @ @     @ @   |",
                "|                 |",
                "|                 |",
                "|              5  |",
                "|_________________|",



        };



        FOUR_OF_CLUBS = new String[]{

                " _________________ ",
                "|                 |",
                "|  4              |",
                "|                 |",
                "|    @       @    |",
                "|   @ @     @ @   |",
                "|    ^       ^    |",
                "|                 |",
                "|                 |",
                "|    @       @    |",
                "|   @ @     @ @   |",
                "|    ^       ^    |",
                "|                 |",
                "|              4  |",
                "|_________________|",



        };



        FOUR_OF_DIAMONDS = new String[]{

                " _________________ ",
                "|                 |",
                "|  4              |",
                "|                 |",
                "|    ^       ^    |",
                "|    V       V    |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|    ^       ^    |",
                "|    V       V    |",
                "|                 |",
                "|                 |",
                "|              4  |",
                "|_________________|",



        };



        FOUR_OF_HEARTS = new String[]{

                " _________________ ",
                "|                 |",
                "|  4              |",
                "|                 |",
                "|    <3     <3    |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|    <3     <3    |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|              4  |",
                "|_________________|",



        };



        FOUR_OF_SPADES = new String[]{

                " _________________ ",
                "|                 |",
                "|  4              |",
                "|                 |",
                "|    A       A    |",
                "|   @ @     @ @   |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|    A       A    |",
                "|   @ @     @ @   |",
                "|                 |",
                "|                 |",
                "|              4  |",
                "|_________________|",



        };



        NINE_OF_CLUBS = new String[]{

                " _________________ ",
                "|                 |",
                "|  9              |",
                "|                 |",
                "|   @    @    @   |",
                "|  @ @  @ @  @ @  |",
                "|   ^    ^    ^   |",
                "|   @    @    @   |",
                "|  @ @  @ @  @ @  |",
                "|   ^    ^    ^   |",
                "|   @    @    @   |",
                "|  @ @  @ @  @ @  |",
                "|   ^    ^    ^   |",
                "|              9  |",
                "|_________________|",



        };



        NINE_OF_DIAMONDS = new String[]{

                " _________________ ",
                "|                 |",
                "|  9              |",
                "|                 |",
                "|   ^    ^    ^   |",
                "|   V    V    V   |",
                "|                 |",
                "|   ^    ^    ^   |",
                "|   V    V    V   |",
                "|                 |",
                "|   ^    ^    ^   |",
                "|   V    V    V   |",
                "|                 |",
                "|              9  |",
                "|_________________|",



        };



        NINE_OF_HEARTS = new String[]{

                " _________________ ",
                "|                 |",
                "|  9              |",
                "|                 |",
                "|   <3   <3   <3  |",
                "|                 |",
                "|                 |",
                "|   <3   <3   <3  |",
                "|                 |",
                "|                 |",
                "|   <3   <3   <3  |",
                "|                 |",
                "|                 |",
                "|              9  |",
                "|_________________|",



        };



        NINE_OF_SPADES = new String[]{

                " _________________ ",
                "|                 |",
                "|  9              |",
                "|                 |",
                "|   A    A    A   |",
                "|  @ @  @ @  @ @  |",
                "|                 |",
                "|   A    A    A   |",
                "|  @ @  @ @  @ @  |",
                "|                 |",
                "|   A    A    A   |",
                "|  @ @  @ @  @ @  |",
                "|                 |",
                "|              9  |",
                "|_________________|",



        };


        SEVEN_OF_CLUBS = new String[]{

                " _________________ ",
                "|                 |",
                "|  7              |",
                "|                 |",
                "|    @       @    |",
                "|   @ @     @ @   |",
                "|    ^       ^    |",
                "|   @    @    @   |",
                "|  @ @  @ @  @ @  |",
                "|   ^    ^    ^   |",
                "|    @       @    |",
                "|   @ @     @ @   |",
                "|    ^       ^    |",
                "|              7  |",
                "|_________________|",



        };



        SEVEN_OF_DIAMONDS = new String[]{

                " _________________ ",
                "|                 |",
                "|  7              |",
                "|                 |",
                "|    ^       ^    |",
                "|    V       V    |",
                "|                 |",
                "|   ^    ^    ^   |",
                "|   V    V    V   |",
                "|                 |",
                "|    ^       ^    |",
                "|    V       V    |",
                "|                 |",
                "|              7  |",
                "|_________________|",



        };



        SEVEN_OF_HEARTS = new String[]{

                " _________________ ",
                "|                 |",
                "|  7              |",
                "|                 |",
                "|    <3      <3   |",
                "|                 |",
                "|                 |",
                "|   <3   <3   <3  |",
                "|                 |",
                "|                 |",
                "|    <3      <3   |",
                "|                 |",
                "|                 |",
                "|              7  |",
                "|_________________|",



        };



        SEVEN_OF_SPADES = new String[]{

                " _________________ ",
                "|                 |",
                "|  7              |",
                "|                 |",
                "|    A       A    |",
                "|   @ @     @ @   |",
                "|                 |",
                "|   A    A    A   |",
                "|  @ @  @ @  @ @  |",
                "|                 |",
                "|    A       A    |",
                "|   @ @     @ @   |",
                "|                 |",
                "|              7  |",
                "|_________________|",



        };



        SIX_OF_CLUBS= new String[]{

                " _________________ ",
                "|                 |",
                "|  6              |",
                "|                 |",
                "|    @       @    |",
                "|   @ @     @ @   |",
                "|    ^       ^    |",
                "|    @       @    |",
                "|   @ @     @ @   |",
                "|    ^       ^    |",
                "|    @       @    |",
                "|   @ @     @ @   |",
                "|    ^       ^    |",
                "|              6  |",
                "|_________________|",



        };



        SIX_OF_DIAMONDS = new String[]{

                " _________________ ",
                "|                 |",
                "|  6              |",
                "|                 |",
                "|    ^       ^    |",
                "|    V       V    |",
                "|                 |",
                "|    ^       ^    |",
                "|    V       V    |",
                "|                 |",
                "|    ^       ^    |",
                "|    V       V    |",
                "|                 |",
                "|              6  |",
                "|_________________|",



        };



        SIX_OF_HEARTS = new String[]{

                " _________________ ",
                "|                 |",
                "|  6              |",
                "|                 |",
                "|    <3      <3   |",
                "|                 |",
                "|                 |",
                "|    <3      <3   |",
                "|                 |",
                "|                 |",
                "|    <3      <3   |",
                "|                 |",
                "|                 |",
                "|              6  |",
                "|_________________|",



        };



        SIX_OF_SPADES = new String[]{

                " _________________ ",
                "|                 |",
                "|  6              |",
                "|                 |",
                "|    A       A    |",
                "|   @ @     @ @   |",
                "|                 |",
                "|    A       A    |",
                "|   @ @     @ @   |",
                "|                 |",
                "|    A       A    |",
                "|   @ @     @ @   |",
                "|                 |",
                "|              6  |",
                "|_________________|",



        };



        TEN_OF_CLUBS = new String[]{

                " _________________ ",
                "|                 |",
                "|  10             |",
                "|                 |",
                "|   @    @    @   |",
                "|  @ @  @ @  @ @  |",
                "|   ^    ^    ^   |",
                "| @    @    @   @ |",
                "|@ @  @ @  @ @ @ @|",
                "| ^    ^    ^   ^ |",
                "|   @    @    @   |",
                "|  @ @  @ @  @ @  |",
                "|   ^    ^    ^   |",
                "|             10  |",
                "|_________________|",



        };



        TEN_OF_DIAMONDS = new String[]{

                " _________________ ",
                "|                 |",
                "|  10             |",
                "|                 |",
                "|   ^    ^    ^   |",
                "|   V    V    V   |",
                "|                 |",
                "| ^    ^    ^   ^ |",
                "| V    V    V   V |",
                "|                 |",
                "|   ^    ^    ^   |",
                "|   V    V    V   |",
                "|                 |",
                "|             10  |",
                "|_________________|",



        };



        TEN_OF_HEARTS = new String[]{

                " _________________ ",
                "|                 |",
                "|  10             |",
                "|                 |",
                "|   <3   <3   <3  |",
                "|                 |",
                "|                 |",
                "| <3   <3   <3  <3|",
                "|                 |",
                "|                 |",
                "|   <3   <3   <3  |",
                "|                 |",
                "|                 |",
                "|             10  |",
                "|_________________|",



        };



        TEN_OF_SPADES = new String[]{

                " _________________ ",
                "|                 |",
                "|  10             |",
                "|                 |",
                "|   A    A    A   |",
                "|  @ @  @ @  @ @  |",
                "|                 |",
                "| A    A    A   A |",
                "|@ @  @ @  @ @ @ @|",
                "|                 |",
                "|   A    A    A   |",
                "|  @ @  @ @  @ @  |",
                "|                 |",
                "|             10  |",
                "|_________________|",



        };



        THREE_OF_CLUBS = new String[]{

                " _________________ ",
                "|                 |",
                "|  3              |",
                "|                 |",
                "|    @       @    |",
                "|   @ @     @ @   |",
                "|    ^       ^    |",
                "|                 |",
                "|                 |",
                "|        @        |",
                "|       @ @       |",
                "|        ^        |",
                "|                 |",
                "|              3  |",
                "|_________________|",



        };



        THREE_OF_DIAMONDS = new String[]{

                " _________________ ",
                "|                 |",
                "|  3              |",
                "|                 |",
                "|    ^       ^    |",
                "|    V       V    |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|        ^        |",
                "|        V        |",
                "|                 |",
                "|                 |",
                "|              3  |",
                "|_________________|",



        };



        THREE_OF_HEARTS = new String[]{

                " _________________ ",
                "|                 |",
                "|  3              |",
                "|                 |",
                "|    <3      <3   |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|        <3       |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|              3  |",
                "|_________________|",



        };



        THREE_OF_SPADES = new String[]{

                " _________________ ",
                "|                 |",
                "|  3              |",
                "|                 |",
                "|    A       A    |",
                "|   @ @     @ @   |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|        A        |",
                "|       @ @       |",
                "|                 |",
                "|                 |",
                "|              3  |",
                "|_________________|",



        };



        TWO_OF_CLUBS = new String[]{

                " _________________ ",
                "|                 |",
                "|  2              |",
                "|                 |",
                "|        @        |",
                "|       @ @       |",
                "|        ^        |",
                "|                 |",
                "|                 |",
                "|        @        |",
                "|       @ @       |",
                "|        ^        |",
                "|                 |",
                "|              2  |",
                "|_________________|",



        };




        TWO_OF_HEARTS = new String[]{

                " _________________ ",
                "|                 |",
                "|  2              |",
                "|        A        |",
                "|       O O       |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|        A        |",
                "|       O O       |",
                "|                 |",
                "|                 |",
                "|              2  |",
                "|_________________|",



        };


        TWO_OF_DIAMONDS = new String[]{

                " _________________ ",
                "|                 |",
                "|  2              |",
                "|                 |",
                "|        ^        |",
                "|        V        |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|        ^        |",
                "|        V        |",
                "|                 |",
                "|                 |",
                "|              2  |",
                "|_________________|",



        };



        TWO_OF_SPADES = new String[]{

                " _________________ ",
                "|                 |",
                "|  2              |",
                "|        A        |",
                "|       O O       |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|                 |",
                "|        A        |",
                "|       O O       |",
                "|                 |",
                "|                 |",
                "|              2  |",
                "|_________________|",



        };


    }

    public Art() {
        assignSlotArt();
        assignCardArt();
    }

    public void assignCardArt() {
        cardArt = new HashMap<String, String[]>();
        cardArt.put("KING OF DIAMONDS", KING_OF_DIAMONDS);
        cardArt.put("QUEEN OF DIAMONDS", QUEEN_OF_DIAMONDS);
        cardArt.put("JACK OF DIAMONDS", JACK_OF_DIAMONDS);
        cardArt.put("TEN OF DIAMONDS", TEN_OF_DIAMONDS);
        cardArt.put("NINE OF DIAMONDS", NINE_OF_DIAMONDS);
        cardArt.put("EIGHT OF DIAMONDS", EIGHT_OF_DIAMONDS);
        cardArt.put("SEVEN OF DIAMONDS", SEVEN_OF_DIAMONDS);
        cardArt.put("SIX OF DIAMONDS", SIX_OF_DIAMONDS);
        cardArt.put("FIVE OF DIAMONDS", FIVE_OF_DIAMONDS);
        cardArt.put("FOUR OF DIAMONDS", FOUR_OF_DIAMONDS);
        cardArt.put("THREE OF DIAMONDS", THREE_OF_DIAMONDS);
        cardArt.put("TWO OF DIAMONDS", TWO_OF_DIAMONDS);
        cardArt.put("ACE OF DIAMONDS", ACE_OF_DIAMONDS);
        cardArt.put("KING OF HEARTS", KING_OF_HEARTS);
        cardArt.put("QUEEN OF HEARTS", QUEEN_OF_HEARTS);
        cardArt.put("JACK OF HEARTS", JACK_OF_HEARTS);
        cardArt.put("TEN OF HEARTS", TEN_OF_HEARTS);
        cardArt.put("NINE OF HEARTS", NINE_OF_HEARTS);
        cardArt.put("EIGHT OF HEARTS", EIGHT_OF_HEARTS);
        cardArt.put("SEVEN OF HEARTS", SEVEN_OF_HEARTS);
        cardArt.put("SIX OF HEARTS", SIX_OF_HEARTS);
        cardArt.put("FIVE OF HEARTS", FIVE_OF_HEARTS);
        cardArt.put("FOUR OF HEARTS", FOUR_OF_HEARTS);
        cardArt.put("THREE OF HEARTS", THREE_OF_HEARTS);
        cardArt.put("TWO OF HEARTS", TWO_OF_HEARTS);
        cardArt.put("ACE OF HEARTS", ACE_OF_HEARTS);
        cardArt.put("KING OF SPADES", KING_OF_SPADES);
        cardArt.put("QUEEN OF SPADES", QUEEN_OF_SPADES);
        cardArt.put("JACK OF SPADES", JACK_OF_SPADES);
        cardArt.put("TEN OF SPADES", TEN_OF_SPADES);
        cardArt.put("NINE OF SPADES", NINE_OF_SPADES);
        cardArt.put("EIGHT OF SPADES", EIGHT_OF_SPADES);
        cardArt.put("SEVEN OF SPADES", SEVEN_OF_SPADES);
        cardArt.put("SIX OF SPADES", SIX_OF_SPADES);
        cardArt.put("FIVE OF SPADES", FIVE_OF_SPADES);
        cardArt.put("FOUR OF SPADES", FOUR_OF_SPADES);
        cardArt.put("THREE OF SPADES", THREE_OF_SPADES);
        cardArt.put("TWO OF SPADES", TWO_OF_SPADES);
        cardArt.put("ACE OF SPADES", ACE_OF_SPADES);
        cardArt.put("KING OF CLUBS", KING_OF_CLUBS);
        cardArt.put("QUEEN OF CLUBS", QUEEN_OF_CLUBS);
        cardArt.put("JACK OF CLUBS", JACK_OF_CLUBS);
        cardArt.put("TEN OF CLUBS", TEN_OF_CLUBS);
        cardArt.put("NINE OF CLUBS", NINE_OF_CLUBS);
        cardArt.put("EIGHT OF CLUBS", EIGHT_OF_CLUBS);
        cardArt.put("SEVEN OF CLUBS", SEVEN_OF_CLUBS);
        cardArt.put("SIX OF CLUBS", SIX_OF_CLUBS);
        cardArt.put("FIVE OF CLUBS", FIVE_OF_CLUBS);
        cardArt.put("FOUR OF CLUBS", FOUR_OF_CLUBS);
        cardArt.put("THREE OF CLUBS", THREE_OF_CLUBS);
        cardArt.put("TWO OF CLUBS", TWO_OF_CLUBS);
        cardArt.put("ACE OF CLUBS", ACE_OF_CLUBS);




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

    public ArrayList<String[]> loadCardArt(String[] cards) {
        ArrayList<String[]> cardArray = new ArrayList<String[]>();
        for (String card : cards) {

            cardArray.add(cardArt.get(card));
        }
        return cardArray;
    }

    private ArrayList<String[]> test = new ArrayList<String[]>(Arrays.asList(SATURN, LAZERGUN, SPACESHIP));



    public void processASCIIArt(ArrayList<String[]> anArray, int arrayLength) {
        int arrayIdx = 0;
        while (arrayIdx < arrayLength) {
            StringBuilder sb = new StringBuilder();
            for (String[] array: anArray) {
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
        String[] example = {"ACE OF CLUBS", "QUEEN OF DIAMONDS"};

        obj.processASCIIArt(obj.loadCardArt(example), 15);
    }
*/
}
