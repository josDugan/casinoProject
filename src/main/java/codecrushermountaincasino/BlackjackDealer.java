package codecrushermountaincasino;

import java.util.Scanner;

/**
 * Created by joseph on 1/31/16.
 */
public class BlackjackDealer extends Dealer {

    public boolean hitOrStand() {
        return promptUserIntInput();
    }

    private boolean promptUserIntInput() {
        boolean hit = false;
        int validInput = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Hit (1) or stand (2)?");
        if (in.hasNextInt()) {
            validInput = in.nextInt();
            if (validInput == 1) {
                return true;
            }
            else if (validInput == 2) {
                return false;
            }
            else {
                System.out.println("Choose to hit or stand.");
                return promptUserIntInput();
            }
        }

        else {
            System.out.println("Invalid move. Press 1 to Hit or 2 to Stand.");
            return promptUserIntInput();
        }
    }

    public boolean playAgain() {
        return promptUserIntInputForAnotherGame();
    }

    private boolean promptUserIntInputForAnotherGame() {
        boolean hit = false;
        int validInput = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Play J'AROBAK again? [Yes (1), No (2)");
        if (in.hasNextInt()) {
            validInput = in.nextInt();
            if (validInput == 1) {
                return true;
            }
            else if (validInput == 2) {
                return false;
            }
            else {
                System.out.println("Choose to hit or stand.");
                return promptUserIntInput();
            }
        }

        else {
            System.out.println("Invalid move. Press 1 to Hit or 2 to Stand.");
            return promptUserIntInput();
        }
    }


}
