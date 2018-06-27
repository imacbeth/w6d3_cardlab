import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }


    public int cardCount(){
        return hand.size();
    }

    public void putCardInHand(Card card){
        hand.add(card);
    }

    public String getName(){
        return this.name;
    }

    public Card getCard() {
        return hand.get(0);
    }

    public int handTotal() {
        int total = 0;
        for (Card card : this.hand){
            total+=card.getValueFromEnum();
        }
            return total;
    }
}
