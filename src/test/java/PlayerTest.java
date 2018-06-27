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
        hand.add(card1);
        hand.add(card2);
        player = new Player("Iona", hand);
    }

    @Test
    public void hasCards(){
        assertEquals(2, player.cardCount());
    }

}
