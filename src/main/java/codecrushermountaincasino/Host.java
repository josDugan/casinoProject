package codecrushermountaincasino;

import com.sun.jdi.PathSearchingVirtualMachine;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by Taylor on 1/30/16.
 */
public class Host {
    public Host() {

    }

    public void greet() {
        System.out.println("It's 2000 years in the future. You are an adventuring gambler with a chip on\n" +
                " your shoulder. You're  You've had it\n" +
                "with the same old casinos on Earth. You used your previous winnings to buy a\n" +
                "universal translator helmet and catch a spaceship to the planet K'aynzara.\n" +
                " The journey was long and tumultuous, but you decide it's all worth it when \n" +
                "you arrive and you stumble upon a casino nearby. 'The Probe. Seems legit,'\n" +
                "you think to yourself. \n\n" +
                "You head in through the double doors, and find a lackluster alien who appears\n" +
                "to hate his job. His name tag reads 'Ulmin'.\n\n" +
                "'Welcome to The Probe, where our games are the same as the ones on Earth.', Ulmin\n" +
                "drones. He squints his eyes at you. 'That look of disappointment gets me\n" +
                "through the day.' \n\n" +
                "");

    }

    public String askName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("'So, human, what's your name?'");
        String name = scan.nextLine();
        System.out.println("'" + name + ", huh? Well that sounds weird, so I'm just gonna call you 'human'.\n" +
                "'That's kinda racist, Ulmin.', you reply. Ulmin just shrugs.");
        return "human";
    }

    public int askWhatGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("'What game number would you like to play, human?'\n" +
                "1. PLORGNAR    2. SLOGGATS    3. J'AROBAK ");
        int game = scan.nextInt();
        return game;
    }

    public void giveChips(Player player) {
        int startingChips = 500;
        System.out.println("'YOU GET 500 LORPS, HUMAN. DON'T BAARDU IT ALL AT ONCE!'\n" +
                "The alien snorts rudely as he takes a big bite of his YikYak bar.\n" +
                "He throws a sack of lorps at you. You fumble and catch it.\n");
        player.addChips(startingChips);
    }

    public void tellJoke() {

        System.out.println("He pulls out a sheet of paper titled 'Jokes for humans'.\n" +
                "'Knock, knock.'\n" +
                "'Who's there?'\n" +
                "Ulmin smacks you in the face. 'You shouldn't stand so close to the door!'\n" +
                "");
        
    }

    public static void main(String[] args) {
        Host ulmin = new Host();
        ulmin.greet();
        ulmin.askName();
        ulmin.askWhatGame();
        ulmin.giveChips();
        ulmin.tellJoke();
    }
}
