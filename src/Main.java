

import java.io.IOException;

import java.io.File;
import net.sourceforge.tess4j.*;

import java.awt.Rectangle;


public class Main {

    public static void main(String[] args) throws IOException, TesseractException {

        Tesseract reader = new Tesseract();
        reader.setDatapath("resources");
        reader.setLanguage("title");
        Rectangle rect = new Rectangle(55, 55, 400, 35);


        CardLoader cardLoader = new CardLoader();
        Deck deck = cardLoader.loadCards();


        String temp = "temp";
    }

}
