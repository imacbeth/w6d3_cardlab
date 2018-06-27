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

    public void getCard(Card card){
        hand.add(card);
    }


}
