package codecrushermountaincasino;

import java.util.Scanner;

/**
 * Created by joseph on 1/30/16.
 */
public class Dealer {

    public int getBet() {
        return promptUserIntInput();
    }

    private int promptUserIntInput() {
        int bet = 0;
        boolean validInput = false;
        Scanner in = new Scanner(System.in);

        System.out.println("Place your bet now.");
        if (in.hasNextInt()) {
            bet = in.nextInt();
            if (bet > 0)
                return bet;
            else {
                System.out.println("The alien dealer glares at you. 'Please bet a legitimate amount of money.");
                return promptUserIntInput();
            }
        }

        else {
            System.out.println("Not a valid bet. Please enter your bet as a postive number");
            return promptUserIntInput();
        }
    }

}

