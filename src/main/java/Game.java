import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game() {
        this.deck = new Deck();
        this.players = new ArrayList<Player>();
    }

    public Deck getDeck() {
        return this.deck;
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public void addPlayer(String name) {
        this.players.add(new Player(name));
    }

    public void setupGame() {
        this.deck.buildDeck();
        this.deck.shuffleDeck();
    }

    public void dealHand() {
        for (Player player : this.players) {
            player.addCard(deck.dealCard());
        }
    }

    public void checkHigherScore() {
        ArrayList<Player>  winningPlayers;
        for (Player player : this.players) {
            if winningPla
            if (player.getCard() > ) {
                higherScorePlayer = pla
            }
        }
    }


//    public Player playHand() {
//        // setup the game
//        // deal a player a card
//        // check player scores
//        // evaluate scores
//        // declare and return winner
//    }
}
