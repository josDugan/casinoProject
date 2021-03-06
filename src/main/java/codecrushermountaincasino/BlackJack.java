package codecrushermountaincasino;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Joseph Dugan on 1/30/16.
 */
public class BlackJack extends CardGame{
    private Hand playerHand;
    private Hand computerHand;
    private final static HashMap<Card.Rank, Integer> SCORING_GUIDE = new HashMap<Card.Rank, Integer>();

    // populates the scoring guide
    static {
        int scoreValue = 1;  // Ace value at start of enum
        for (Card.Rank rank : Card.Rank.values()) {
            if (rank.equals(Card.Rank.JACK) || rank.equals(Card.Rank.QUEEN) || rank.equals(Card.Rank.KING))
                SCORING_GUIDE.put(rank, 10);
            else {
                SCORING_GUIDE.put(rank, scoreValue);
                scoreValue++;
            }
        }
    }

    public BlackJack(Player player) {
        super(player);

        playerHand = new Hand();
        computerHand = new Hand();
        playBlackJack();
    }


    public void playBlackJack() {
        printGreeting();
        BlackjackDealer dealer = new BlackjackDealer();
        int bet = dealer.getBet();
        Deck deck = getDeck();
        Player humanPlayer = getPlayer();
        humanPlayer.setScore(0);
        Player computerPlayer = new Player("D'Jibidab");
        int playerTurn = -1;
        int computerTurn = 1;

        // set game to play
        setInPlay(true);
        setTurn(playerTurn);
        initialDeal(deck, playerHand, computerHand, computerPlayer);
        boolean computerBusted = false;
        boolean humanNotBusted = true;

        while (getInPlay()) {


            if (getTurn() == playerTurn) {  // hitting standing logic begins here
                boolean hit = dealer.hitOrStand();
                if (hit) {
                    hit(playerHand);
                    scoreHand(playerHand, humanPlayer);
                    if (playerBusted(humanPlayer)) {
                        humanNotBusted = false;
                        toggleInPlay();
                    }
                }
                else {
                    stand();
                }
            }
            else
            {
                if (computerPlayer.getScore() < 17) {
                    hit(computerHand);
                    scoreHand(computerHand, computerPlayer);
                    if (playerBusted(computerPlayer)) {
                        System.out.println(humanPlayer.getName() + " wins.");
                        computerBusted = true;
                        toggleInPlay();
                    }
                }
                else {
                    stand();
                    toggleInPlay();
                }


            }
            displayHandsAndScore(computerPlayer);

        }

        // determine winner and pass chips to human if game was won
        if (humanNotBusted && (computerBusted || humanPlayer.getScore() > computerPlayer.getScore())) {
            System.out.println("You just won " + bet + " lorps!");
            humanPlayer.addChips(bet);
        } else if (humanPlayer.getScore() == computerPlayer.getScore()) {
            System.out.println("Tie goes to the Probe, you lose.");
        } else {
            System.out.println(humanPlayer.getName() + " lost.\n");
        }

        System.out.println("You have a total of " + humanPlayer.getChips() + " lorps.\n");


        humanPlayer.setScore(0);
        computerPlayer.setScore(0);
        playerHand.getHand().clear();
        computerHand.getHand().clear();

        if (dealer.playAgain()) {
            playBlackJack();
        } else {
            System.out.println("'We have a bunch of other games here. Actually, two more.'\n");
        }
    }

    private void initialDeal(Deck deck, Hand playerHand, Hand computerHand, Player computerPlayer) {
        playerHand.addCard(deck.dealCardOffTop());
        computerHand.addCard(deck.dealCardOffTop());
        playerHand.addCard((deck.dealCardOffTop()));
        computerHand.addCard(deck.dealCardOffTop());
        scoreHand(playerHand, getPlayer());
        scoreHand(computerHand, computerPlayer);
        displayHandsAndScore(computerPlayer);
    }



    private void hit(Hand hand) {
        hand.addCard(getDeck().dealCardOffTop());
    }


    private void stand() {
        setTurn(getTurn() * -1);
    }

    private void displayHandsAndScore(Player computerPlayer) {
        System.out.println("=========================================================================================");
        System.out.println();
        System.out.println("BLACKJACK");
        System.out.println(getPlayer().getName() + "'s score: " + getPlayer().getScore());
        System.out.println();
        System.out.println(getPlayer().getName() +  "'s Hand: \n");
        playerHand.showCards();
        System.out.println();
        System.out.println(computerPlayer.getName() + "'s score: " + computerPlayer.getScore());
        System.out.println();
        System.out.println(computerPlayer.getName() + "'s Hand: \n");
        computerHand.showCards();
        System.out.println();
        System.out.println("=========================================================================================");
        System.out.println();
    }

    private void scoreHand(Hand hand, Player player) {
        ArrayList<Card> cardsInHand = hand.getHand();
        int score = 0;

        for (Card card : cardsInHand) {
            int scoreToAdd =  SCORING_GUIDE.get(card.getRank());
            if (card.getRank().equals(Card.Rank.ACE) && player.getScore() < 12)
                scoreToAdd += 10;
            score += scoreToAdd;
        }

        player.setScore(score);
    }

    private boolean playerBusted(Player player) {
        if (player.getScore() > 21) {
            System.out.println("Busted!\n");
            return true;
        }
        return false;

    }


    private void printGreeting(){
        System.out.println(""+
                "              ('-.      _  .-')                .-. .-')      ('-.    .-. .-')\n"+
                "          ,--.  ( OO ).-. ( \\( -O )              \\  ( OO )    ( OO ).-. \\  ( OO )\n"+
                "    ,--. \\  |  / . --. /  ,------.  .-'),-----.  ;-----.\\    / . --. / ,--. ,--.\n"+
                " .-')| ,|  `-'  | \\-.  \\  |  /`. ' ( OO'  .-.  ' | .-.  |    | \\-.  \\  |  .'  /\n"+
                "( OO |(_|      .-'-'  |  |  |  /  | | /  |  | |  | | '-' /_) .-'-'  |  | |      /,\n"+
                "| `-'|  |      \\| |_.'  |  |  |_.' | \\_) |  |\\|  | | .-. `.  \\| |_.'  | |    ' _) \n"+
                ",--. |  |        |  .-.  |  |  .  '.'  \\ |  | |  | | |  \\  |  |  .-.  | |  .  \\\n"+
                "|  '-'  /        |  | |  |  |  |\\  \\    `'  '-'  ' | '--'  /  |  | |  | |  |\\  \\\n"+
                "`-----'        `--' `--'  `--' '--'      `-----'  `------'    `--' `--' `--' '--'");

    }




}


