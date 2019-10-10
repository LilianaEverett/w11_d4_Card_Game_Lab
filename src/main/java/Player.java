public class Player {

    private Card card;
    private String name;

    public Player(String name) {
        this.name = name;
        this.card = null;
    }

    public String getName() {
        return this.name;
    }

    public Card getCard() {
        return this.card;
    }

    public void addCard(Card card) {
        this.card = card;
    }
}
