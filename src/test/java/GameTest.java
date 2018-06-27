import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game game;
    Player player1;
    Player player2;
    Deck deck;
    Card card;


    @Before
    public void before(){

        player1 = new Player("Iona");
        player2 = new Player("Can");
        Player[] players = {player1, player2};
        deck = new Deck();
        game = new Game(deck, players);
    }

    @Test
    public void hasPlayers(){
        System.out.println(game.getPlayer(0).getName());
        assertEquals(2, game.playerCount());

    }

}
