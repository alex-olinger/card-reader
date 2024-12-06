import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CardLoader {

    public CardLoader() {
    }

    public Deck loadCards() {
        File imgDir = new File("resources/cards");
        File[] imgFiles = imgDir.listFiles();

        Deck deck = new Deck();

        for (int i = 0; i < imgFiles.length; i++) {
            File file = imgFiles[i];
            Card card = new Card(file, null, null);
            deck.insertCard(card);
        }
        return deck;

    }
}




