import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

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
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canShuffleDeck() {
        deck.buildDeck();
        assertEquals(, deck.);
    }


}
