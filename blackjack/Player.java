package blackjack;

import java.util.*;

public class Player {

    private final String name;
    private int score;
    ArrayList<Card> hand;

    public Player(String newName) {
        name = newName;
        hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void getCard(Deck a) {
        hand.add(a.removeCard());
    }

    public ArrayList getHand() {
        return hand;
    }

    public void printHandWithoutFirstCardSoThatOtherPlayersCannotSeeItButTheDealerStillCanCauseTheRuleApparentlySaysSo() {
        for (int i = 0; i < hand.size(); i++) {
            if (i != 0) {
                System.out.println(hand.get(i).getName());
            } else {
                System.out.println("Hidden Card");
            }
        }
    }

    public void printHand() {
        for (int i = 0; i < hand.size(); i++) {
            System.out.println(hand.get(i).getName());
        }
    }

    public int getScore() {
        int total = 0;
        for (int i = 0; i < hand.size(); i++) {
            total += hand.get(i).getPoints();
        }

        if (total > 21) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getPoints() == 11) {
                    total -= 10; // changes ace value
                }
                if (total <= 21) {
                    break;  // stops loop once total is low enough
                }
            }
        }

        if (total > 21) {
            return 0;
        }
        return total;
    }

    public void setScore() {
        score = getScore();
    }

    // for testing getScore
    /*
    public void getAce(Deck a) {
        hand.add(a.removeAce());
    }
     */
}
