import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;
    private Card card;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> createDeck() {

        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                card = new Card(suit, rank);
                cards.add(card);
            }
        }
        return cards;
    }

    public ArrayList<Card> shuffleDeck(){
        Collections.shuffle(cards);
        return cards;
    }

    public Card removeCard(){
        return cards.remove(0);
    }

}


