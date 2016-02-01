package codecrushermountaincasino;

/**
 * Created by Taylor on 1/30/16.
 */
public class Casino {
    private Player guest;
    private Host host;

    public Casino(){
        host = new Host();
        guest = new Player("");
    }

    public void letTheGamesBegin(){
        host.greet();
        String guestName = host.askName();
        guest.setName(guestName);
        host.giveChips(guest);

        // choose game here
        while (true) {
            chooseGame();
        }
    }

    private void chooseGame(){
        int gameChoice = host.askWhatGame();

        switch (gameChoice) {
            case 1:
                PokerGame poker = new PokerGame(guest);
                poker.playPoker();
                break;
            case 2:
                Slots slots = new Slots(guest);
                slots.
                break;
            case 3:

                break;
            case 4:

                break;
            default:

                break;
        }
    }
}
