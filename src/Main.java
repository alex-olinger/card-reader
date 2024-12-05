

import java.io.IOException;

import java.io.File;
import net.sourceforge.tess4j.*;

import java.awt.Rectangle;


public class Main {

    public static void main(String[] args) throws IOException, TesseractException {

        Tesseract reader = new Tesseract();
        reader.setDatapath("resources");
        reader.setLanguage("title");
        File imgFile = new File("resources/cards/card1.jpg");
        Rectangle rect = new Rectangle(55, 55, 400, 35);



        String result = reader.doOCR(imgFile, rect);
        String temp = "temp";

    }

}
