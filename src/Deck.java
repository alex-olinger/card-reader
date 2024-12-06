import java.util.ArrayList;
import java.util.List;

public class Deck {

    List<Card> deck;


    public Deck() {
        deck = new ArrayList<>();
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void insertCard(Card card) {
        deck.add(card);
    }
}
