import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GameTest {

    private Game game;

    @Before
    public void before() {
        game = new Game();
        game.addPlayer("Graham");
        game.addPlayer("Water");
        game.addPlayer("Bottle");
    }

    @Test
    public void canGetDeck() {
        assertTrue(game.getDeck() instanceof Deck);
        assertEquals(0, game.getDeck().countCards());
    }

    @Test
    public void canGetPlayers() {
        assertEquals(0, game.getPlayers().size());
        assertTrue(game.getPlayers() instanceof ArrayList);
    }

    @Test
    public void canAddPlayer() {
        game.addPlayer("Liliana");
        assertEquals(4, game.getPlayers().size());
    }

    @Test
    public void canDealCard() {
        game.setupGame();
        game.dealHand();
        assertNotNull(game.getPlayers().get(0).getCard());
    }

    @Test
    public void canCheckScores() {
        assertEquals();
    }

}
