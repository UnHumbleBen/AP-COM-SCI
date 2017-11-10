/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Benjamin
 */
import java.util.ArrayList;
public class Deck {
    ArrayList<Card> deck;
    public Deck() {
        deck = new ArrayList<Card>();
        for (int i = 0; i < 52; i++) {
            String name = "";
            int value = i % 13;
            if (i / 13 == 0) name = "Spade";
            if (i / 13 == 1) name = "Club";
            if (i / 13 == 2) name = "Heart";
            if (i / 13 == 3) name = "Diamond";
            
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
}
