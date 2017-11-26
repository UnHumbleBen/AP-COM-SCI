package blackjack;

import java.util.*;

public class Deck {

    ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            String name = "";
            int value = i % 13;
            if (i / 13 == 0) {
                name = "Spades";
            }
            if (i / 13 == 1) {
                name = "Clubs";
            }
            if (i / 13 == 2) {
                name = "Hearts";
            }
            if (i / 13 == 3) {
                name = "Diamonds";
            }

            Card n = new Card(name, value);
            deck.add(n);
        }
    }

    public void deckSize() {
        System.out.println(deck.size());
    }

    public void printDeck() {
        for (int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i).getName());
        }
    }

    public Card removeCard() {
        Random rand = new Random();
        int n = rand.nextInt(deck.size());
        Card temp = deck.get(n);
        //System.out.println("Added Card: " + temp.getName());
        deck.remove(n);
        return temp;
    }

    // testing the scores
    public Card removeAce() {
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).getPoints() == 11) {
                Card temp = deck.get(i);
                deck.remove(deck.get(i));
                return temp;
            }
        }
        return null;
    }
}
