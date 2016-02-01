package codecrushermountaincasino;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by Taylor on 1/30/16.
 */
public class PokerGame extends CardGame {
    private Hand[] playerHands;
    private Player computerPlayer;
    private String computerPlayerName;
    private int pot;
    private int numPlayers = 2;
    private int handSize = 5;
    Scanner scan;


    public static void main(String[] args)   {
        PokerGame game = new PokerGame(new Player("OgNarf"));
    }

    public PokerGame(Player player)  {
        super(player);
        scan = new Scanner(System.in);
        playerHands = new Hand[numPlayers];
        playPoker();
    }

    public void playPoker()  {

        printBlipBlorp();


        while (getInPlay()) {

            for (int i = 0; i < numPlayers; i++) {
                playerHands[i] = new Hand();
                playerHands[i].addNCards(deck.dealNCards(handSize));
                sortHand(playerHands[i]);
            }

            System.out.println("Make ya Bets yous got " +player.getChips()+ " lorps");
            int bet = isValidBet(scan.nextLine());
            pot += bet;
            player.removeChips(bet);



            System.out.println("Your hand is:");
            printHand(playerHands[0].getHand());

            // delay the processing a bit

            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {

            }


            System.out.println("You gonna fold or play?");

            String foldOrPlay = isValidFoldorPlay(scan.nextLine());

            if(foldOrPlay.equalsIgnoreCase("fold") || foldOrPlay.equalsIgnoreCase("f"))
                if(fold() == true) // will return true if the player wants to play another hand after folding
                    continue;
                else
                    return;

            bet();

            System.out.println("You wanna discard?");

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {

            }

            printHand(playerHands[0].getHand());
            String yesOrNo = isValidYesNoDiscard(scan.nextLine());
            if(yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("y")){
                System.out.println("Just tell me then numbers of the cards you wanna discard...  Can you handle that??");
                String[] discard = isValidOneThroughFive(scan.nextLine());
                for (int i = 0; i < discard.length; i++) {
                    int temp = Integer.parseInt(discard[i]);
                    playerHands[0].discardAndReplace(temp - 1, deck.dealCardOffTop());
                }

                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {

                }

                System.out.println("I'm gonna discard " + (int)(Math.random()*6)+ " cards.");
                sortHand(playerHands[0]);
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (InterruptedException e) {

                }
                System.out.println("Your new hand is: ");
                printHand(playerHands[0].getHand());
               bet();
            }

            /*sortHand(playerHands[0]);
            System.out.println("Your hand is:");
            printHand(playerHands[0].getHand());*/

            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {

            }

            System.out.println("My hand is:");
            printHand(playerHands[1].getHand());


            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {

            }

            if (compareHand(playerHands).getId() == 0) {
                System.out.println("You win, here.... worthless human... " + "+" + (pot) + " lorps.");
            } else {
                System.out.println("YOU LOSE HaJahaaJoJO......  And they say you are an intelligent race.....");
            }

            System.out.println("You gonna play again?");
            yesOrNo = isValidYesNo(scan.nextLine());
            if (yesOrNo.equalsIgnoreCase("no") || yesOrNo.equalsIgnoreCase("n")) {
                System.out.println("I know you were muphlarph...");
                toggleInPlay();
            }
        }


    }

        private void bet(){
            if(player.getChips() > 0) {
                System.out.println("Do you want to Bet some more?  ");
                String yesOrNo = isValidYesNo(scan.nextLine());
                if (yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("y")) {
                    System.out.println("How much u wanna bet big guy? You got " + player.getChips() + " lorps in case yous can't count");
                    int bet = isValidBet(scan.nextLine());
                    pot += bet;
                    player.removeChips(bet);
                }
            } else{
                System.out.println("You got no chips left so I'm not gonna bother asking you for a bet....");
            }

        }

        private void printHand(ArrayList<Card> hand){
            int count= 1;
            String handResult = "";
            for (Card card : hand) {
                handResult += "(" + count + ")" + card + "    ";
                count++;
            }
            System.out.println(handResult);
        }

        private String isValidFoldorPlay(String str){
            boolean isValid = false;
            while(!isValid)
            if(!(str.equalsIgnoreCase("fold") || str.equalsIgnoreCase("play") || str.equalsIgnoreCase("f") || str.equalsIgnoreCase("p"))){
                System.out.println("I said fold or play...  What don't you understand?  Read my mandibles... Fold or Play??");
                Scanner scan= new Scanner(System.in);
                str = scan.nextLine();
            } else {
                isValid = true;
            }
            return str;
        }


    private int isValidBet(String str){
        int result = 0;
        int validInt = 0;
        boolean exception = false;
        while(validInt != 1) {
            try {
                result = Integer.parseInt(str);
                exception = false;
            } catch (NumberFormatException e) {
                System.out.println("That's not a number.  Dirty human.....  What's your wager? ");
                exception = true;
            } catch (NullPointerException e) {
                System.out.println("That's not a number.  Dirty human.....  What's your wager? ");
                exception = true;
            }
            if (result > player.getChips() && !exception) {
                System.out.println("You don't have enough lorps!  Don't you know how to count human?  Try again....");
            } else if (!exception && result == player.getChips()){
                System.out.println("All in huh?  Cocky human.... ");
                validInt = 1;
                return result;
            } else if(!exception){
                validInt = 1;
            }
         if(validInt!=1) {
             Scanner scan = new Scanner(System.in);
             str = scan.nextLine();
         }
        }
        return result;
    }

    private String isValidYesNo(String str) {

        boolean isValid = false;
        while(!isValid)
            if(!(str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("y") || str.equalsIgnoreCase("no") || str.equalsIgnoreCase("n"))){
                System.out.println("I said Yes.... or No.... You humans really are as dumb as you are ugly.....");
                Scanner scan= new Scanner(System.in);
                str = scan.nextLine();
            } else {
                isValid = true;
            }
        return str;

    }

    private String isValidYesNoDiscard(String str) {

        boolean isValid = false;
        while(!isValid)
            if(!(str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("y") || str.equalsIgnoreCase("no") || str.equalsIgnoreCase("n"))){
                System.out.println("It's a Yes or No Question.... I'll say it slowly.... Do.... you... want.. to... discard?");
                Scanner scan= new Scanner(System.in);
                str = scan.nextLine();
            } else {
                isValid = true;
            }
        return str;

    }

    private String[] isValidOneThroughFive(String str){


        boolean isValid = false;
        String[] strings = {};
        Scanner scan = new Scanner(System.in);

        while(!isValid){
            strings = str.split("\\s");
            for (String string : strings) {
                try {
                   int i= Integer.parseInt(string);
                    if (!(i > 0 && i <= 5)){
                        System.out.println(string);
                        System.out.println("Dumb and ugly.... You only have five cards...  Which cards do you want to discard?");
                        str = scan.nextLine();
                        continue;
                    }  else {
                        isValid = true;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Just tell me the numbers of the cards you wanna discard....");
                    str = scan.nextLine();
                } catch (NullPointerException e) {
                    System.out.println("Just tell me the numbers of the cards you wanna discard....");
                    str = scan.nextLine();
                }
            }



        }
        return strings;
    }

    private boolean fold() {

        System.out.println("You Fold.  You Lose.  Play again?");
        Scanner scan = new Scanner(System.in);
        boolean valid = true;
        do {
            String str = scan.nextLine();
            if (!(str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("y") || str.equalsIgnoreCase("no") || str.equalsIgnoreCase("n"))) {
                System.out.println("That's not what I axed.  You gonna play again?  Yes or No?  Humans....(grunt)");
                valid = false;
            } else {
                if (str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("y")) {
                    return true;
                } else {
                    toggleInPlay();
                    return false;
                }
            }
        } while (!valid);

        return false;
    }

    private Hand compareHand(Hand... hands) {

        Hand winner = hands[0];


        if (HandEvaluator.evaluateHand(winner.getHand()) < HandEvaluator.evaluateHand(hands[1].getHand()))
            winner = hands[1];


        return winner;

    }


    public static void sortHand(Hand hand) {
        Collections.sort(hand.getHand());
    }


    private void printBlipBlorp(){


        String welcomeTo = ""+
        "(O))  ((O)    wWw     W  W         c  c      .-.      \\\\    ///    wWw        (o)__(o)     .-.\n"+
        " ||    ||     (O)_   (O)(O)        (OO)    c(O_O)c    ((O)  (O))    (O)_       (__  __)   c(O_O)c\n"+
        " || /\\ ||     / __)    ||        ,'.--.)  ,'.---.`,    | \\  / |     / __)        (  )    ,'.---.`,\n"+
        " ||//\\\\||    / (       | \\      / //_|_\\ / /|_|_|\\ \\   ||\\\\//||    / (            )(    / /|_|_|\\ \\ \n"+
        " / /  \\ \\   (  _)      |  `.    | \\___   | \\_____/ |   || \\/ ||   (  _)          (  )   | \\_____/ |\n"+
        "( /    \\ )   \\ \\_     (.-.__)   '.    )  '. `---' .`   ||    ||    \\ \\_           )/    '. `---' .`\n"+
        " )      (     \\__)     `-'        `-.'     `-...-'    (_/    \\_)    \\__)         (        `-...-'";




        String blipBlorp3 = ""+
               " ___      W  W       wW  Ww    ))              ___      W  W        .-.       ()_()     ))          .--.       .--.       .--.\n"+
               "(___)__  (O)(O)      (O)(O)   (o0)-.          (___)__  (O)(O)     c(O_O)c     (O o)    (o0)-.      (O)(O)     (O)(O)     (O)(O)\n"+
               "(O)(O)     ||         (..)     | (_))         (O)(O)     ||      ,'.---.`,     |^_\\     | (_))     | o /      | o /      | o /\n"+
               "/  _\\      | \\         ||      | .-'          /  _\\      | \\    / /|_|_|\\ \\    |(_))    | .-'      |`-/       |`-/       |`-/\n"+
               "| |_))     |  `.      _||_     |(             | |_))     |  `.  | \\_____/ |    |  /     |(         |_/        |_/        |_/\n"+
               "| |_))    (.-.__)    (_/\\_)     \\)            | |_))    (.-.__) '. `---' .`    )|\\\\      \\)        _          _          _\n"+
               "(.'-'      `-'                  (             (.'-'      `-'      `-...-'     (/  \\)     (        (_)        (_)        (_)";


        System.out.println(welcomeTo+"\n\n");


        try {
            TimeUnit.MILLISECONDS.sleep(1300);
        } catch (InterruptedException e) {

        }
        System.out.println(blipBlorp3);

        try {
            TimeUnit.MILLISECONDS.sleep(1500);
        } catch (InterruptedException e) {

        }
        System.out.println("\n\n\n\n\n\nUUHHH........ I'll be your dealer BlopBlopTim.  Listen..... I don't like you.... you don't like me.... lets not make this a regular thing\n");

        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {

        }

        System.out.println("I am requird to tell you that Blip Blorp is a lot like a game your planet has called five card draw poker\n");
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {

        }
        System.out.println("But you'll be playin agan'st me and blah blah blah..... Play or don't play... I don't care\n");

        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {

        }

    }



}


class HandEvaluator {

    static int evaluateHand(ArrayList<Card> hand) {

        if (isRoyalFlush(hand) == true) {
            return 10;
        } else if (isStraightFlush(hand) == true) {
            return 9;
        } else if (isFourOfAKind(hand) == true) {
            return 8;
        } else if (isFullHouse(hand) == true) {
            return 7;
        } else if (isFlush(hand) == true) {
            return 6;
        } else if (isStraight(hand) == true) {
            return 5;
        } else if (isThreeOfAKind(hand) == true) {
            return 4;
        } else if (isTwoPair(hand) == true) {
            return 3;
        } else if (isPair(hand) == true) {
            return 2;
        } else if (isHighCard(hand) == true) {
            return 1;
        } else {
            return -1;
        }
    }


    private static Boolean isFlush(ArrayList<Card> hand) {
        Boolean flushCase = hand.get(0).getSuit().ordinal() == hand.get(1).getSuit().ordinal() &&
                hand.get(0).getSuit().ordinal() == hand.get(2).getSuit().ordinal() &&
                hand.get(0).getSuit().ordinal() == hand.get(3).getSuit().ordinal() &&
                hand.get(0).getSuit().ordinal() == hand.get(4).getSuit().ordinal();

        return flushCase;
    }

    private static Boolean isStraight(ArrayList<Card> hand) {
        Boolean firstCheck = hand.get(1).getRank().ordinal() == (hand.get(0).getRank().ordinal() + 1);
        Boolean secondCheck = hand.get(2).getRank().ordinal() == (hand.get(1).getRank().ordinal() + 1);
        Boolean thirdCheck = hand.get(3).getRank().ordinal() == (hand.get(2).getRank().ordinal() + 1);
        Boolean fourthCheck = hand.get(4).getRank().ordinal() == (hand.get(3).getRank().ordinal() + 1);

        return (firstCheck && secondCheck && thirdCheck && fourthCheck);
    }

    private static boolean isStraightFlush(ArrayList<Card> hand) {
        return (isFlush(hand) && isStraight(hand));
    }

    private static boolean isRoyalFlush(ArrayList<Card> hand) {
        return (isFlush(hand) && isStraight(hand) && hand.get(4).getRank().ordinal() == 12);
    }

    private static boolean isFourOfAKind(ArrayList<Card> hand) {
        // [p, p, p, p, n]
        Boolean firstCase = hand.get(0).getRank().ordinal() == hand.get(1).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() == hand.get(2).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() == hand.get(3).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() != hand.get(4).getRank().ordinal();

        // [n, p, p, p, p]
        Boolean secondCase = hand.get(1).getRank().ordinal() == hand.get(2).getRank().ordinal() &&
                hand.get(1).getRank().ordinal() == hand.get(3).getRank().ordinal() &&
                hand.get(1).getRank().ordinal() == hand.get(4).getRank().ordinal() &&
                hand.get(1).getRank().ordinal() != hand.get(0).getRank().ordinal();

        return (firstCase || secondCase);
    }

    private static boolean isFullHouse(ArrayList<Card> hand) {
        // [p1, p1, p1, p2, p2]
        Boolean firstCase = hand.get(0).getRank().ordinal() == hand.get(1).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() == hand.get(2).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() != hand.get(3).getRank().ordinal() &&
                hand.get(3).getRank().ordinal() == hand.get(4).getRank().ordinal();

        // [p2, p2, p1, p1, p1]
        Boolean secondCase = hand.get(0).getRank().ordinal() == hand.get(1).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() != hand.get(2).getRank().ordinal() &&
                hand.get(2).getRank().ordinal() == hand.get(3).getRank().ordinal() &&
                hand.get(2).getRank().ordinal() == hand.get(4).getRank().ordinal();

        return (firstCase || secondCase);
    }

    private static boolean isThreeOfAKind(ArrayList<Card> hand) {
        // [p, p, p, n, n]
        Boolean firstCase = hand.get(0).getRank().ordinal() == hand.get(1).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() == hand.get(2).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() != hand.get(3).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() != hand.get(4).getRank().ordinal();

        // [n, p, p, p, n]
        Boolean secondCase = hand.get(1).getRank().ordinal() == hand.get(2).getRank().ordinal() &&
                hand.get(1).getRank().ordinal() == hand.get(3).getRank().ordinal() &&
                hand.get(1).getRank().ordinal() != hand.get(0).getRank().ordinal() &&
                hand.get(1).getRank().ordinal() != hand.get(4).getRank().ordinal();

        // [n, n, p, p, p]
        Boolean thirdCase = hand.get(2).getRank().ordinal() == hand.get(3).getRank().ordinal() &&
                hand.get(2).getRank().ordinal() == hand.get(4).getRank().ordinal() &&
                hand.get(2).getRank().ordinal() != hand.get(0).getRank().ordinal() &&
                hand.get(2).getRank().ordinal() != hand.get(1).getRank().ordinal();

        return (firstCase || secondCase || thirdCase);
    }

    private static boolean isTwoPair(ArrayList<Card> hand) {
        // [p1, p1, p2, p2, n]
        Boolean firstCase = hand.get(0).getRank().ordinal() == hand.get(1).getRank().ordinal() &&
                hand.get(2).getRank().ordinal() == hand.get(3).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() != hand.get(2).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() != hand.get(4).getRank().ordinal() &&
                hand.get(2).getRank().ordinal() != hand.get(4).getRank().ordinal();

        // [p1, p1, n, p2, p2]
        Boolean secondCase = hand.get(0).getRank().ordinal() == hand.get(1).getRank().ordinal() &&
                hand.get(3).getRank().ordinal() == hand.get(4).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() != hand.get(2).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() != hand.get(4).getRank().ordinal() &&
                hand.get(2).getRank().ordinal() != hand.get(4).getRank().ordinal();


        // [n, p1, p1, p2, p2]
        Boolean thirdCase = hand.get(1).getRank().ordinal() == hand.get(2).getRank().ordinal() &&
                hand.get(3).getRank().ordinal() == hand.get(4).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() != hand.get(2).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() != hand.get(4).getRank().ordinal() &&
                hand.get(1).getRank().ordinal() != hand.get(3).getRank().ordinal();

        return (firstCase || secondCase || thirdCase);
    }

    private static boolean isPair(ArrayList<Card> hand) {
        // [p, p, n, n, n]
        Boolean firstCase = hand.get(0).getRank().ordinal() == hand.get(1).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() != hand.get(2).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() != hand.get(3).getRank().ordinal() &&
                hand.get(0).getRank().ordinal() != hand.get(4).getRank().ordinal();

        // [n, p, p, n, n]
        Boolean secondCase = hand.get(1).getRank().ordinal() == hand.get(2).getRank().ordinal() &&
                hand.get(1).getRank().ordinal() != hand.get(0).getRank().ordinal() &&
                hand.get(1).getRank().ordinal() != hand.get(3).getRank().ordinal() &&
                hand.get(1).getRank().ordinal() != hand.get(4).getRank().ordinal();

        // [n, n, p, p, n]
        Boolean thirdCase = hand.get(2).getRank().ordinal() == hand.get(3).getRank().ordinal() &&
                hand.get(2).getRank().ordinal() != hand.get(0).getRank().ordinal() &&
                hand.get(2).getRank().ordinal() != hand.get(1).getRank().ordinal() &&
                hand.get(2).getRank().ordinal() != hand.get(4).getRank().ordinal();

        // [n, n, n, p, p]
        Boolean fourthCase = hand.get(3).getRank().ordinal() == hand.get(4).getRank().ordinal() &&
                hand.get(3).getRank().ordinal() != hand.get(0).getRank().ordinal() &&
                hand.get(3).getRank().ordinal() != hand.get(1).getRank().ordinal() &&
                hand.get(3).getRank().ordinal() != hand.get(2).getRank().ordinal();

        return (firstCase || secondCase || thirdCase || fourthCase);
    }

    private static boolean isHighCard(ArrayList<Card> hand) {
        Boolean checkAllOtherHands = isPair(hand) || isTwoPair(hand) || isThreeOfAKind(hand) ||
                isFourOfAKind(hand) || isStraight(hand) || isFlush(hand) || isRoyalFlush(hand) ||
                isFullHouse(hand) || isStraightFlush(hand);

        return !checkAllOtherHands;
    }



}
