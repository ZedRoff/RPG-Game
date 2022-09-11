
import java.util.HashMap;

public class Player {
    private String name;
    private HashMap<String, String> card;
 
    public Player(String name, HashMap<String, String> card) {
        this.name = name;
        this.card = card;
     
    }
    public String getName() {
        return name;
    }
 
    public HashMap<String, String> getCard() {
        return card;
    }
    public void setCard(HashMap<String, String> newCard) {
        this.card = newCard;
    }

  

}