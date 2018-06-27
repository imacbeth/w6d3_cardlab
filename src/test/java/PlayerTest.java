import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card1;
    Card card2;
    ArrayList<Card> hand;

    @Before
    public void before(){
        hand = new ArrayList<>();
        card1 = new Card(SuitType.HEARTS, RankType.ACE);
        card2 = new Card(SuitType.SPADES, RankType.TEN);
        player = new Player("Iona");
    }

    @Test
    public void hasCards(){
        assertEquals(0, player.cardCount());
    }

    @Test
    public void canGetCards(){
        player.putCardInHand(card1);
        player.putCardInHand(card2);
        assertEquals(2, player.cardCount());
    }

}
