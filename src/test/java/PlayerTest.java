import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card;

    @Before
    public void before() {
        player = new Player("Liliana");
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void hasName() {
        assertEquals("Liliana", player.getName());
    }

    @Test
    public void canGetCard() {
        assertEquals(null, player.getCard());
    }

    @Test
    public void canAddCard() {
        player.addCard(card);
        assertEquals(card, player.getCard());
    }
}
