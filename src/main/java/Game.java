public class Game {

    private Deck deck;
    private Player[] players;

    public Game(Deck deck, Player[] players) {
        this.deck = deck;
        this.players = new Player[2];
        this.players = players;
    }

    public int playerCount() {
        return this.players.length;
    }

    public Player getPlayer(int index){
        return this.players[index];
    }
}
