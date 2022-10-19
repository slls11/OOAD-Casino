package src;

import java.util.ArrayList;
import java.util.Scanner;
import src.Observer.*;

public class Blackjack extends Game {

    /* Attributes */
    private ArrayList<Player> players = new ArrayList<>();

    private Dealer dealer;

    // This will be instantiated in the deal hand method
    Deck deck;
    int decksUsed = 1;

    /* Methods */

    // Blackjack Constructor
    public Blackjack(int gameNumber, ArrayList<Player> players, Dealer dealer){

        // set gameNumber for parent game class
        super.gameNumber = gameNumber;

        // set players and dealer attributes for blackjack object
        this.players = players;
        this.dealer = dealer;

    }

    // Return user, or first person in players arraylist
    public Player getUser(){
        return players.get(0);
    }

    // select bet size for game
    public double betSize(Player player){

        double playerBet = 0.0;

        Scanner in = new Scanner(System.in);

        while (true) {
            out("Select a bet size for this round: ");

            // create input variable
            String input;

            // if input is the enter button, exit loop

            input = in.nextLine();


            if (input.length() == 0) {
                out("No number detected. Try Again.");
            }

            // break up each item in input and analyzes to see if it's a double
            // if it is a double, accept input and continue on with game
            try {
                double bet = Double.parseDouble(input);
                if (bet < player.getBankRoll() && bet>0.0){
                    out("$" + bet + " is the wager for this hand");
                    playerBet = bet;
                    break;
                }
                else if (bet > player.getBankRoll()){
                    out("$" + bet + " is more money than the player has in their bankroll. Enter smaller value.");
                }
                else{
                    out("Input not accepted, please Try Again.");
                }
            }
            catch (NumberFormatException e) {
                out(input + " is not a valid input.");
            }
        }

        return playerBet;
    }

    public void dealHand(Player user, Dealer dealer, Logger logger){

        // Set new deck of cards
        deck = new Deck(decksUsed);
        decksUsed++;

        // deal cards to player and dealer
        user.Hand.add(deck.getCard());
        dealer.Hand.add(deck.getCard());
        user.Hand.add(deck.getCard());
        dealer.Hand.add(deck.getCard());

        // reveal cards to player, along with 1 dealer card
        out("User card 1: ");
        Card userCard1 = user.Hand.get(0);
        String card1 = printCardToScreen(userCard1);
        new GameObserver(logger, "User card 1: " + card1);
        new GameObserver(logger, userCard1.cardArt);

        out("User card 2: ");
        Card userCard2 = user.Hand.get(1);
        String card2 = printCardToScreen(userCard2);
        new GameObserver(logger, "User card 2: " + card2);
        new GameObserver(logger, userCard2.cardArt);

        out("Dealer card 1: ");
        Card dealerCard1 = dealer.Hand.get(0);
        String card3 = printCardToScreen(dealerCard1);
        new GameObserver(logger, "Dealer card 1: " + card3);
        new GameObserver(logger, dealerCard1.cardArt);

        out("Dealer card 2:");
        out("Card is HIDDEN from User");
        out(" ________\n" +
                "|??    ??|\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ??    |\n" +
                "| _____??|");
        new GameObserver(logger, "Dealer card 2: " + "Card is HIDDEN from User");
    }

    public String printCardToScreen(Card card){
         if (card.getValue() < 11){
            out(card.getValue() + " of " + card.getSuit());
            card.draw();
            return (card.getValue() + " of " + card.getSuit());
        } else if (card.getValue() == 11){
            out("Jack" + " of " + card.getSuit());
             card.draw();
            return ("Jack" + " of " + card.getSuit());
        } else if (card.getValue() == 12){
            out("Queen" + " of " + card.getSuit());
             card.draw();
            return ("Queen" + " of " + card.getSuit());
        } else if (card.getValue() == 13){
            out("King" + " of " + card.getSuit());
             card.draw();
            return ("King" + " of " + card.getSuit());
        } else if (card.getValue() == 14){
            out("Ace" + " of " + card.getSuit());
             card.draw();
             return ("Ace" + " of " + card.getSuit());
        }


        return "";
    }

    public void playerChoice(Player user, Dealer dealer, Logger logger){

        // make new scanner object
        Scanner in = new Scanner(System.in);

        // display user hand value
        out("Total current hand value for USER is: " + user.countHand());
        new GameObserver(logger, "Total current hand value for USER is: " + user.countHand());

        while (true) {

            // check player hand value
            if (user.countHand() > 21){
                decideWinner(user, dealer, logger);
                break;
            }

            
            out("Player choices are Hit (1), Stand (2): ");

            // create input variable
            String input;

            input = in.nextLine();

            // if input is the enter button, exit loop
            if (input.length() == 0) {
                out("No number detected. Try Again.");
            }

            // break up each item in input and analyzes to see if it's a double
            // if it is a double, accept input and continue on with game
            try {
                int choice = Integer.parseInt(input);
                if (choice == 1){
                    out("Player has chosen hit. Another card will be dealt.");
                    new GameObserver(logger, "Player has chosen hit. Another card will be dealt.");
                    user.Hand.add(deck.getCard());
                    Card newCard = user.Hand.get(user.Hand.size() - 1);
                    String new_card = printCardToScreen(newCard);
                    new GameObserver(logger, new_card);
                    new GameObserver(logger, newCard.cardArt);
                    out("Total current hand value for USER is:" + user.countHand());
                    new GameObserver(logger, "Total current hand value for USER is:" + user.countHand());
                }
                else if (choice == 2){
                    out("Player has chosen to stand.");
                    new GameObserver(logger, "Player has chosen to stand.");
                    out("Total current hand value for USER is: " + user.countHand());
                    new GameObserver(logger, "Total current hand value for USER is: " + user.countHand());
                    out("Revealing second card for dealer: ");
                    new GameObserver(logger, "Revealing second card for dealer: ");
                    Card dealerCard2 = dealer.Hand.get(1);
                    String dealercard2 = printCardToScreen(dealerCard2);
                    new GameObserver(logger, dealercard2);
                    new GameObserver(logger, dealerCard2.cardArt);
                    out("Total current hand value for DEALER is: " + dealer.countHand());
                    new GameObserver(logger, "Total current hand value for DEALER is: " + dealer.countHand());
                    while (dealer.countHand() < 17){
                        out("Dealer less than 17. Dealer is dealt another card:");
                        new GameObserver(logger, "Dealer less than 17. Dealer is dealt another card:");
                        dealer.Hand.add(deck.getCard());
                        Card newCard = dealer.Hand.get(dealer.Hand.size() - 1);
                        String new_card = printCardToScreen(newCard);
                        new GameObserver(logger, new_card);
                        new GameObserver(logger, newCard.cardArt);
                        out("Total current dealer hand value is: " + dealer.countHand());
                        new GameObserver(logger, "Total current dealer hand value is: " + dealer.countHand());
                    }
                    decideWinner(user, dealer, logger);
                    break;
                }
                else{
                    out("Input not accepted, please Try Again.");
                }
            }
            catch (NumberFormatException e) {
                out(input + " is not a valid input.");
            }
        }

    }

    public void decideWinner(Player user, Dealer dealer, Logger logger){
        int playerScore = user.countHand();
        int dealerScore = dealer.countHand();

        if (playerScore > 21) {
            out("User is over 21, User has busted");
            out("**************************");
            out("DEALER WINS");
            user.setBankRoll(-1*(user.getBet()));
            new GameObserver(logger, "User is over 21, User has busted");
            new GameObserver(logger, "**************************");
            new GameObserver(logger, "DEALER WINS");
        }
        else if (dealerScore > 21) {
            out("Dealer is over 21, Dealer has busted");
            out("**************************");
            out("PLAYER WINS");
            user.setBankRoll(user.getBet());
            new GameObserver(logger, "Dealer is over 21, Dealer has busted");
            new GameObserver(logger, "**************************");
            new GameObserver(logger, "PLAYER WINS");
        }
        else if (playerScore == dealerScore){
            out("The hand resulted in a PUSH");
            // bet amount returned to user
            out("**************************");
            out("PUSH");
            new GameObserver(logger, "The hand resulted in a PUSH");
            new GameObserver(logger, "**************************");
            new GameObserver(logger, "PUSH");
        }
        else if (playerScore > dealerScore) {
            out("**************************");
            out("USER WINS");
            user.setBankRoll(user.getBet());
            new GameObserver(logger, "**************************");
            new GameObserver(logger, "USER WINS");
        }
        else{
            out("**************************");
            out("DEALER WINS");
            user.setBankRoll(-1*(user.getBet()));
            new GameObserver(logger, "**************************");
            new GameObserver(logger, "DEALER WINS");
        }

        // clear hands for user and dealer
        user.Hand.removeAll(user.Hand);
        dealer.Hand.removeAll(dealer.Hand);
    }

}
