

import java.io.IOException;

import java.io.File;
import net.sourceforge.tess4j.*;

import java.awt.Rectangle;


public class Main {

    public static void main(String[] args) throws IOException, TesseractException {

        CardLoader cardLoader = new CardLoader();
        Deck deck = cardLoader.loadCards();
        deck.runOCROnDeck();
        deck.outputToTxtFiles();


        String temp = "temp";
    }

}
