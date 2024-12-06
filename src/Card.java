import java.io.File;

public class Card {
    private File cardFile;
    private String cardTitle;
    private String cardBody;



    public Card(File cardFile, String cardTitle, String cardBody) {
        this.cardFile = cardFile;
        this.cardTitle = cardTitle;
        this.cardBody = cardBody;
    }

    public File getCardFile() {
        return cardFile;
    }

    public void setCardTitle(String cardTitle) {
        this.cardTitle = cardTitle;
    }

    public void setCardBody(String cardBody) {
        this.cardBody = cardBody;
    }




}
