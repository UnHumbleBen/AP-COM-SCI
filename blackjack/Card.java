/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

public class Card {
    private String suit;
    private int value;
    public Card (String newName, int newValue) {
        suit = newName;
        value = newValue;
    }
    
    public String getName() {
        String cardValue = value + "";
        if (value == 0) cardValue = "King";
        if (value == 11) cardValue = "Jack";
        if (value == 12) cardValue = "Queen";
        
        return cardValue + " of " + suit;
    }
    
}
