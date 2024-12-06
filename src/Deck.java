import java.util.ArrayList;
import java.util.List;
import net.sourceforge.tess4j.*;
import java.io.*;
import java.awt.Rectangle;

public class Deck {

    private List<Card> deck;


    public Deck() {
        this.deck = new ArrayList<>();
    }

    public List<Card> getDeck() {
        return this.deck;
    }

    public void insertCard(Card card) {
        this.deck.add(card);
    }

    public void runOCROnDeck() throws TesseractException {
        Tesseract reader = new Tesseract();
        reader.setDatapath("resources");
        reader.setLanguage("title");
        Rectangle titleTextBox = new Rectangle(55, 55, 400, 35);
        Rectangle bodyTextBox = new Rectangle(50, 600, 565, 260);

        for (Card card : this.deck) {
            reader.setLanguage("title");
            File currentCardFile = card.getCardFile();
            card.setCardTitle(reader.doOCR(currentCardFile,titleTextBox));
            reader.setLanguage("body");
            card.setCardBody(reader.doOCR(currentCardFile,bodyTextBox));
        }
    }

    public void printToText() {
        
    }
}
