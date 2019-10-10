import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public int countCards() {
        return this.cards.size();
    }

    public void buildDeck() {
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                this.cards.add(new Card(suit, rank));
            }
        }
    }
}
