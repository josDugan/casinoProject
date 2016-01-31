package codecrushermountaincasino;

import java.lang.reflect.Array;
import java.util.*;

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


    public static void main(String[] args) {
        PokerGame game = new PokerGame(new Player("OgNarf"));
    }

    public PokerGame(Player player) {
        super(player);
        scan = new Scanner(System.in);
        playerHands = new Hand[numPlayers];
        playPoker();
    }

    public void playPoker(){

        for (int i = 0 ; i < numPlayers; i++){
            playerHands[i] = new Hand();
            playerHands[i].addNCards(deck.dealNCards(handSize));
            sortHand(playerHands[i]);
            System.out.println(playerHands[i]);
        }


        while(getInPlay()){

            System.out.println("Place a Bet Mother Fucker");
            int bet = scan.nextInt();

            for (int i = 0 ; i < numPlayers; i++){
                System.out.println(playerHands[i]);
            }


            if(compareHand(playerHands).getId() == 0){
                System.out.println("You win, here is your worthless human money. "  + (bet * 2) + " dollars.");
            } else{
                System.out.println("YOU LOSE");
            }

            toggleInPlay();
        }


    }


    private Hand compareHand(Hand... hands) {

        Hand winner = hands[0];


        for(int i = 0; i < hands.length-1; i++) {
            if (HandEvaluator.evaluateHand(winner.getHand()) < HandEvaluator.evaluateHand(hands[i + 1].getHand()))
                winner = hands[i + 1];
        }
        return winner;

    }


    public static void sortHand(Hand hand)                                                                                                                                               {
        Collections.sort(hand.getHand());
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

        return checkAllOtherHands;
    }


}
