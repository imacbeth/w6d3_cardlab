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

    public Player getPlayer(int index) {
        return this.players[index];
    }

    public void setUpGame() {
        deck.createDeck();
        deck.shuffleDeck();
    }


    public void dealCardToPlayer(Player player) {
        Card card = this.deck.removeCard();
        player.putCardInHand(card);
    }

    public void checkWinner() {
        Card cardOfPlayer1 = players[0].getCard();
        Card cardOfPlayer2 = players[1].getCard();

        if (cardOfPlayer1.getValueFromEnum() == cardOfPlayer2.getValueFromEnum()) {
            System.out.println("It's a draw!");

        } else if (cardOfPlayer1.getValueFromEnum() > cardOfPlayer2.getValueFromEnum()) {
            System.out.println(players[0].getName() + " plays " + cardOfPlayer1.getRank());
            System.out.println(players[1].getName() + " plays " + cardOfPlayer2.getRank());
            System.out.println(players[0].getName() + " wins!");
        } else {
            System.out.println(players[0].getName() + " plays " + cardOfPlayer1.getRank());
            System.out.println(players[1].getName() + " plays " + cardOfPlayer2.getRank());
            System.out.println(players[1].getName() + " wins!");
        }
    }


    public void play1CardGame() {
        setUpGame();
        dealCardToPlayer(players[0]);
        dealCardToPlayer(players[1]);
        checkWinner();
    }


}
