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

    public void setUpGame(){
        deck.createDeck();
        deck.shuffleDeck();
    }


    public void dealCardToPlayer(Player player){
        Card card = this.deck.removeCard();
        player.putCardInHand(card);
    }

    public Player checkWinner() {
        Card cardOfPlayer1= players[0].getCard();
        Card cardOfPlayer2= players[1].getCard();
        if (cardOfPlayer1.getValueFromEnum()>cardOfPlayer2.getValueFromEnum())
            return players[0];
        else
            return players[1];
    }
}
