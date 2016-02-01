package codecrushermountaincasino;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by lucky on 2/1/16.
 */
public class GiftShop {
    Player player;
    ArrayList<Gift> shop = new ArrayList<Gift>();

    public GiftShop(Player player) {
        this.player = player;
        addGifts();
        printWelcome();

    }

    void addGifts() {


        shop.add(new Gift(100, "" +
                "  _.._..,_,_\n" +
                " (          )\n" +
                "  ]~,\"-.-~~[\n" +
                ".=])' (;  ([\n" +
                "| ]:: '    [\n" +
                "'=]): .)  ([\n" +
                "  |:: '    |\n" +
                "   ~~----~~"));

        shop.add(new Gift(1000, "" +
                ".===================================================================.\n" +
                "||     __   _    __   __  __   __          __   ..        __       ||\n" +
                "|| -=]|__  /_\\  |__) |__ |__) /  \\ |\\  /| |__) |  | |__/ |__ |\\ |  ||\n" +
                "|| -=]|   /   \\ |  \\ |   |  \\ \\__/ | \\/ | |    \\__/ |  \\ |__ | \\|  ||\n" +
                "||                            ___                                  ||\n" +
                "||                          .'   '.                                ||\n" +
                "||                         /       \\           oOoOo               ||\n" +
                "||                        |         |       ,==|||||               ||\n" +
                "||                         \\       /       _|| |||||               ||\n" +
                "||                          '.___.'    _.-'^|| |||||               ||\n" +
                "||                        __/_______.-'     '==HHHHH               ||\n" +
                "||                   _.-'` /                   \"\"\"\"\"               ||\n" +
                "||                .-'     /   oOoOo                                ||\n" +
                "||                `-._   / ,==|||||                                ||\n" +
                "||                    '-/._|| |||||                                ||\n" +
                "||                     /  ^|| |||||                                ||\n" +
                "||                    /    '==HHHHH                                ||\n" +
                "||                   /________\"\"\"\"\"                                ||\n" +
                "||                   `\\       `\\                                   ||\n" +
                "||                     \\        `\\   /                             ||\n" +
                "||                      «\\         `\\/                             ||\n" +
                "||                      /                                          ||\n" +
                "||                     /                                           ||\n" +
                "||                    /_____                                       ||\n" +
                "||                                                                 ||\n" +
                "'==================================================================='"));


        shop.add(new Gift(10000, "" +
                "      o o\n" +
                "      | |\n" +
                "  _   L_L_\n" +
                "  }\\/__-__\\/{\n" +
                "  }(|~o.o~|){\n" +
                "  }/ \\`-'/ \\{\n" +
                "    _/`U'\\_\n" +
                "   ( .   . )\n" +
                "  / /     \\ \\\n" +
                "  \\ |  ,  | /\n" +
                "   \\|=====|/\n" +
                "    |_.^._|\n" +
                "    | |\"| |\n" +
                "    ( ) ( )\n" +
                "    |_| |_|\n" +
                " _.-' _j L_ '-._\n" +
                "(___.'     '.___)"));


        shop.add(new Gift(50000, "" +
                "           ______s__\n" +
                "          /         \\\n" +
                "         (  {   @  @ )\n" +
                "         |        *   \\\n" +
                "         |__    `---' |\n" +
                "  ,    /   \\________,/\\\n" +
                ", ||  /  .  (    . . ) |\n" +
                "<[||II'  (        -+- | /  _\n" +
                " \\____,__/\\________o__/\\\\ < >ooo\n" +
                "         |     ___    ,--*-- ~~~)\n" +
                "         \\   /   \\   ;     .  /\n" +
                "       ~~~~~-+     +--'--^--`-+~~~\n" +
                "              > *  <\n" +
                "              |    /\n" +
                "               >'   )\n" +
                "              /... /\n" +
                "             ooo<_>\n"));

    }

    void printWelcome() {
        System.out.println("Welcome to the magical realm that is The Probe Gift Shop.  Where all of your dreams will soon come true\n" +
                "Unfortunately we are under construction, but I can let you have a peak at our offerings.....\n\n");

        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {

        }

        System.out.println("Would you like to see our Wares??");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean isValid = false;
        while (!isValid)
            if (!(str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("y") || str.equalsIgnoreCase("no") || str.equalsIgnoreCase("n"))) {
                System.out.println("I said Yes.... or No.... You humans really are as dumb as you are ugly.....");
                scan = new Scanner(System.in);
                str = scan.nextLine();
            } else {
                isValid = true;
            }

        if (str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("y")) {
            System.out.println("What would you like to see?  Here is a our \"menu\" \n" +
                    "1: Beer\n" +
                    "2: A dedicated Drinking Buddy for the duration of your stay\n" +
                    "3: Jopjop our norf norf slave\n" +
                    "4: A Human child we are trying to get rid of we call DB.  He was recently found in one of our dumpsters.\n" +
                    "Tell me an item number...\n");
        } else {
            System.out.println("Whatever.");
            return;}
        Scanner scan1 = new Scanner(System.in);




            boolean keepGoing =true;

            try {
                int thing = scan1.nextInt();

                switch (thing) {
                    case 1:
                        System.out.println(shop.get(thing - 1));
                        break;
                    case 2:
                        System.out.println(shop.get(thing - 1));
                        break;
                    case 3:
                        System.out.println(shop.get(thing - 1));
                        break;
                    case 4:
                        System.out.println(shop.get(thing - 1));
                        break;
                }

                }catch(Exception e){
                System.out.println("Forget it...");
            }
        System.out.println("That's It!");
    }


    public static void main(String[] args) {
        GiftShop g = new GiftShop(new Player("p"));
    }
}
