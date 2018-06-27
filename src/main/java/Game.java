public class Game {

    private Deck deck;
    private Player[] players;

    public Game(Deck deck, Player[] players) {
        this.deck = deck;
        this.players = players;
    }

    public int playerCount() {
        return this.players.length;
    }

    public Player getPlayer(int index) {
        return this.players[index];
    }

    public void setUpGame() {
        deck.shuffleDeck();
    }

    public void dealCardToPlayer(Player player) {
        Card card = this.deck.removeCard();
        player.putCardInHand(card);
    }

    public void checkWinner() {
        if (players[0].handTotal() > players[1].handTotal()) {
            System.out.println(players[0].getName() + " has " + players[0].handTotal());
            System.out.println(players[1].getName() + " has " + players[1].handTotal());
            System.out.println(players[0].getName() + " wins!");
        } else if (players[0].handTotal() < players[1].handTotal()) {
            System.out.println(players[0].getName() + " has " + players[0].handTotal());
            System.out.println(players[1].getName() + " has " + players[1].handTotal());
            System.out.println(players[1].getName() + " wins!");
        } else {
            System.out.println(players[0].getName() + " has " + players[0].handTotal());
            System.out.println(players[1].getName() + " has " + players[1].handTotal());
            System.out.println("It's a draw!!!!");
        }
    }


    public void playCardGame(int numberOfCards) {
        deck.shuffleDeck();
        dealCards(numberOfCards);
        checkWinner();
    }

    private void dealCards(int numberOfCards){
        for (int i = 0; i < numberOfCards; i++){
            for (Player player : players) {
                dealCardToPlayer(player);
            }
        }
    }
}
