package codecrushermountaincasino;

/**
 * Created by Taylor on 1/30/16.
 */
public class Casino {
    private Player guest;
    private Host host;
    String name;

    public Casino(){
        name = "The Probe";
        host = new Host();
        guest = new Player("");
    }

    public void letTheGamesBegin(){
        host.greet();
        String guestName = host.askName();
        guest.setName(guestName);
        host.giveChips(guest);

        // choose game here
        boolean playGames = true;
        while (playGames) {
            chooseGame();
            int stay = host.askStayInCasino();
            if (stay != 1) {
                playGames = false;
            }
        }
        System.out.println("Ulmin looks at the clock behind you. 'Three more augwatts 'till my shift is over.\n" +
                "We look forward to seeing you back at The Probe.'");
    }

    private void chooseGame()  {
        int gameChoice = host.askWhatGame();

        switch (gameChoice) {
            case 1:
                PokerGame poker = new PokerGame(guest);
                break;
            case 2:
                Slots slots = new Slots(guest);
                break;
            case 3:
                BlackJack blackjack = new BlackJack(guest);
                blackjack.playBlackJack();
                break;
            case 4:
                host.tellJoke();
                break;
            default:
                System.out.println("'Don't waste my time. Choose a valid option.'");
                break;
        }
    }

    public String getName() {
        return name;
    }

}
