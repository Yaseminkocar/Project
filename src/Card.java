public class Card {
private String suit ;
private String number;

    public Card(String i, String j) {
        suit = i;
        number = j;
    }

    @Override
    public String toString() {
        return suit + " " + number;
    }
}
