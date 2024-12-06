import java.io.File;

public class CardLoader {

    public CardLoader() {
    }

    public Deck loadCards() {
        File imgDir = new File("resources/cards");
        File[] imgFiles = imgDir.listFiles();

        Deck deck = new Deck();
        for (int i = 0; i < imgFiles.length; i++) {
            String fileName = imgFiles[i].getName();
            Card card = new Card(fileName, null, null);
            deck.insertCard(card);

        }
        return deck;

    }
}


