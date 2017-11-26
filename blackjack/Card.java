package blackjack;

public class Card {

    private final String suit;
    private final int value;
    private final String name;

    public Card(String newName, int newValue) {
        suit = newName;
        value = newValue;
        String cardValue = value + "";
        if (value == 1) {
            cardValue = "Ace";
        }
        if (value == 0) {
            cardValue = "King";
        }
        if (value == 11) {
            cardValue = "Jack";
        }
        if (value == 12) {
            cardValue = "Queen";
        }
        name = cardValue + " of " + suit;

    }

    public String getName() {
        /*
        String cardValue = value + "";
        if (value == 0) cardValue = "King";
        if (value == 11) cardValue = "Jack";
        if (value == 12) cardValue = "Queen";
        
        return cardValue + " of " + suit;
*       */
        return name;
    }

    public int getPoints() {
        if (value == 1) {
            return 11; // for aces
        }
        if (value == 0 || value >= 10) {
            return 10; // for face cards
        }
        return value; // for normal cards
    }
}
