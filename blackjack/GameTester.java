package blackjack;

import java.util.*;

public class GameTester {

    public static void main(String[] args) {
        while (true) {
            Deck deck = new Deck();
            Scanner in = new Scanner(System.in);
            System.out.println("Number of players (Not including the dealer): ");
            int countPlayers = in.nextInt();
            if (countPlayers > 5 || countPlayers < 1) {
                System.out.println("Invalid number of players");
                System.out.println("Press 1 to try again, Press 2 to stop");
                if (in.nextInt() != 1) {
                    break;
                }
            } else {
                ArrayList<Player> players = new ArrayList<>();
                for (int i = 0; i < countPlayers; i++) {
                    Player temp = new Player("Player " + (i + 1));
                    players.add(temp);
                }

                // dealing phase
                for (int i = 0; i < players.size(); i++) {
                    System.out.println("Player " + (i + 1) + " cards are: ");
                    players.get(i).getCard(deck);
                    players.get(i).getCard(deck);
                    players.get(i).printHand();
                    System.out.println("Press 1 to continue");
                    int user = in.nextInt();
                }

                // deal the Dealer
                Player dealer = new Player("The Dealer");
                dealer.getCard(deck);
                dealer.getCard(deck);
                System.out.println("The Dealer's Cards are: ");
                dealer.printHandWithoutFirstCardSoThatOtherPlayersCannotSeeItButTheDealerStillCanCauseTheRuleApparentlySaysSo();
                System.out.println("Press 1 to continue");
                int user1 = in.nextInt();

                // blackJack
                boolean equal21 = false;
                for (int i = 0; i < players.size(); i++) {
                    if (players.get(i).getScore() == 21) {
                        equal21 = true;
                        System.out.println("BLACKJACK!!! for " + players.get(i).getName());
                        System.out.println("His hand was: ");
                        players.get(i).printHand();
                        System.out.println(players.get(i).getName()+ " is the winner!");
                    }
                }

                // hitting phase
                if (!equal21) {
                    for (int i = 0; i < players.size(); i++) {
                        System.out.println(players.get(i).getName() + "'s turn");
                        while (true) {
                            if (true) { // for players
                                System.out.println("Your hand is: ");
                                players.get(i).printHand();
                                System.out.println("Your score is " + players.get(i).getScore());

                                if (players.get(i).getScore() == 0) {
                                    System.out.println("You went over 21!");
                                    System.out.println("Busted!");
                                    System.out.println("Press 1 to continue");
                                    int user2 = in.nextInt();
                                    break;
                                }

                                System.out.println("Press 1 to hit, Press 2 to pass");
                                int user = in.nextInt();
                                if (user != 1) {
                                    break;
                                }

                                players.get(i).getCard(deck);
                            }
                        }
                    }
                    // finding highest score
                    int highest = players.get(0).getScore();
                    int index = 0;
                    for (int i = 1; i < players.size(); i++) {
                        if (players.get(i).getScore() > highest) {
                            highest = players.get(i).getScore();
                            index = i;
                        }
                    }

                    //dealer hits
                    System.out.println("Dealer's Turn");
                    System.out.println("The Dealers hand is: ");
                    dealer.printHand();
                    System.out.println("His score is " + dealer.getScore());
                    System.out.println("Press 1 to continue");
                    int useless2 = in.nextInt();
                    while (dealer.getScore() < 17) {
                        System.out.println("The Dealer hits");
                        dealer.getCard(deck);

                        System.out.println("The Dealers hand is: ");
                        dealer.printHand();
                        System.out.println("His score is " + dealer.getScore());

                        System.out.println("Press 1 to continue");
                        int useless = in.nextInt();

                        if (dealer.getScore() == 0) {
                            System.out.println("Busted!!!");
                            break;
                        }
                    }
                    // present the winner
                    System.out.println("Press 1 to see the winner");
                    int useless1 = in.nextInt();

                    if (dealer.getScore() >= highest) {
                        System.out.println("Dealer wins!");
                    } else {
                        System.out.println(players.get(index).getName() + " IS THE WINNER");
                        System.out.println("with a score of " + players.get(index).getScore());
                    }
                } 

                System.out.println("Press 1 to play another game, Press 2 to stop");
                if (in.nextInt() != 1) {
                    break;
                }
            }
        }
    }
}
