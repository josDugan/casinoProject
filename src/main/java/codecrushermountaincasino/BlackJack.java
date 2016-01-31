package codecrushermountaincasino;

import java.util.Scanner;

/**
 * Created by Taylor, Joseph Dugan on 1/30/16.
 */
public class BlackJack extends CardGame{
    private Hand playerHand;
    private Hand computerHand;

    public BlackJack(Player player) {
        super(player);
        playerHand = new Hand(Integer.MAX_VALUE, );
        computerHand = new Hand(Integer.MAX_VALUE, );
    }

    public void playBlackJack() {
        System.out.println("Welcome to Blackjack!");
        Dealer dealer = new Dealer();
        int bet = dealer.getBet();
        Deck deck = getDeck();
        Player humanPlayer = getPlayer();
        Player computerPlayer = new Player("Computer");
        int playerTurn = -1;
        int computerTurn = 1;

        // set game to play
        toggleInPlay();

        while (getInPlay()) {
            initialDeal(deck, playerHand, computerHand);
            setTurn(playerTurn);

            if (getTurn() == playerTurn) {

            }
            else (getTurn() == computerTurn) {

                toggleInPlay();
            }

        }
    }

    private void initialDeal(Deck deck, Hand playerHand, Hand computerHand) {
        playerHand.addCard(deck.dealCardOffTop());
        computerHand.addCard(deck.dealCardOffTop());
        playerHand.addCard((deck.dealCardOffTop()));
        computerHand.addCard(deck.dealCardOffTop());
        showPlayerHands();
    }

    private void computerAI() {

    }

    hit


    private void hit(Hand hand) {
        hand.addCard();
    }

    private void stand() {
        setTurn(getTurn() * -1);
    }

    private void showPlayerHands() {
        playerHand.showCards();
        computerHand.showCards();
    }
}
