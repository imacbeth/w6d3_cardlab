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

    @Test
    public void canDealToPlayer(){
        game.setUpGame();
        game.dealCardToPlayer(player1);
        assertEquals(1, player1.cardCount());
    }

//    @Test
//    public void canCheckWinner(){
//        deck.createDeck();
//        game.dealCardToPlayer(player1);
//        game.dealCardToPlayer(player2);
//        assertEquals(player2, game.checkWinner());
//    }
    @Test
    public void canCountHandTotal(){
        deck.createDeck();
        game.dealCardToPlayer(player1);
        game.dealCardToPlayer(player1);
        assertEquals(3, player1.handTotal());
    }

    @Test
    public void canPlay1CardGame(){
        game.play1CardGame();
    }
}
