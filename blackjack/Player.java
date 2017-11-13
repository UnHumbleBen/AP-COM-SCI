package blackjack;


import java.util.*;
public class Player {
    private String name;
    private int Score;
    ArrayList<Card> hand;
    
    public Player(String newName) {
        name = newName;
        hand = new ArrayList<Card>();
    }
    
    public void getCard() {
        hand.add(Deck.removeCard());
    }
    
    
}
