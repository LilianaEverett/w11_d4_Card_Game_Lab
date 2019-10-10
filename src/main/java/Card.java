public class Card {

    private SuitType suit;
    private RankType rank;
    private int value;

    public Card(SuitType suit, RankType rank) {
        this.suit = suit;
        this.rank = rank;
        this.value = rank.getRankValue();
    }

    public SuitType getSuit() {
        return this.suit;
    }

    public RankType getRank() {
        return this.rank;
    }


    public int getValue() {
        return this.value;
    }
}
