import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    public int getCardCount(){
        return cards.size();
    }

    public Card removeCard(){
        return cards.remove(0);
    }

}


