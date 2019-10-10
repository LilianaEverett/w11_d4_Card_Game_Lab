import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {

    private Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void hasNoCards() {
        assertEquals(0, deck.countCards());
    }

    @Test
    public void canBuildDeck() {
        deck.buildDeck();
//        deck.shuffleDeck();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canDealCard() {
        deck.buildDeck();
        assertTrue(deck.dealCard() instanceof Card);
        assertEquals(51, deck.countCards());

    }

}
