import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name, ArrayList<Card> hand){
        this.name = name;
        this.hand = hand;
    }


    public int cardCount(){
        return hand.size();
    }



}
