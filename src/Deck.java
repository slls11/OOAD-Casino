package src;
/*  src.Deck will make use of the src.Card class and all game's
    will access the card's functionality and object through
    this class.
    This is an implementation of OBJECT POOL DESIGN METHOD
 */

import src.Decorator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Deck {

    /* attributes */
    private int deckNumber;
    public ArrayList<Card> deck = new ArrayList<>();
    public ArrayList<Card> used_deck = new ArrayList<>();


    /* methods */

    public Deck(int deckNumber){

        // set deck number
        this.deckNumber = deckNumber;

        // CREATE ALL CARDS WITH ART
        Card two_hearts = new Card(2, false, "NULL", "Hearts", "Red", false, " ________\n" +
                "|2     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ 2|");
        deck.add(two_hearts);
        Card three_hearts = new Card(3, false, "NULL", "Hearts", "Red", false, " ________\n" +
                "|3     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ 3|");
        deck.add(three_hearts);
        Card four_hearts = new Card(4, false, "NULL", "Hearts", "Red", false, " ________\n" +
                "|4     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ 4|");
        deck.add(four_hearts);
        Card five_hearts = new Card(5, false, "NULL", "Hearts", "Red", false, " ________\n" +
                "|5     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ 5|");
        deck.add(five_hearts);
        Card six_hearts = new Card(6, false, "NULL", "Hearts", "Red", false, " ________\n" +
                "|6     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ 6|");
        deck.add(six_hearts);
        Card seven_hearts = new Card(7, false, "NULL", "Hearts", "Red", false, " ________\n" +
                "|7     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ 7|");
        deck.add(seven_hearts);
        Card eight_hearts = new Card(8, false, "NULL", "Hearts", "Red", false, " ________\n" +
                "|8     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ 8|");
        deck.add(eight_hearts);
        Card nine_hearts = new Card(9, false, "NULL", "Hearts", "Red", false, " ________\n" +
                "|9     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ 9|");
        deck.add(nine_hearts);
        Card ten_hearts = new Card(10, false, "NULL", "Hearts", "Red", false, " ________\n" +
                "|10    ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| ____ 10|");
        deck.add(ten_hearts);
        Card jack_hearts = new Card(11, true, "Jack", "Hearts", "Red", false, " ________\n" +
                "|J     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ J|");
        deck.add(jack_hearts);
        Card queen_hearts = new Card(12, true, "Queen", "Hearts", "Red", false, " ________\n" +
                "|Q     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ Q|");
        deck.add(queen_hearts);
        Card king_hearts = new Card(13, true, "King", "Hearts", "Red", false, " ________\n" +
                "|K     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ K|");
        deck.add(king_hearts);
        Card ace_hearts = new Card(14, true, "Ace", "Hearts", "Red", false, " ________\n" +
                "|A     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ A|");
        deck.add(ace_hearts);
        Card two_diamonds = new Card(2, false, "NULL", "Diamonds", "Red", false, " ________\n" +
                "|2    ⬥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ⬥    |\n" +
                "| _____ 2|");
        deck.add(two_diamonds);
        Card three_diamonds = new Card(3, false, "NULL", "Diamonds", "Red", false, " ________\n" +
                "|3    ⬥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ⬥    |\n" +
                "| _____ 3|");
        deck.add(three_diamonds);
        Card four_diamonds = new Card(4, false, "NULL", "Diamonds", "Red", false, " ________\n" +
                "|4    ⬥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ⬥    |\n" +
                "| _____ 4|");
        deck.add(four_diamonds);
        Card five_diamonds = new Card(5, false, "NULL", "Diamonds", "Red", false, " ________\n" +
                "|5    ⬥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ⬥    |\n" +
                "| _____ 5|");
        deck.add(five_diamonds);
        Card six_diamonds = new Card(6, false, "NULL", "Diamonds", "Red", false, " ________\n" +
                "|6    ⬥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ⬥    |\n" +
                "| _____ 6|");
        deck.add(six_diamonds);
        Card seven_diamonds = new Card(7, false, "NULL", "Diamonds", "Red", false, " ________\n" +
                "|7    ⬥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ⬥    |\n" +
                "| _____ 7|");
        deck.add(seven_diamonds);
        Card eight_diamonds = new Card(8, false, "NULL", "Diamonds", "Red", false, " ________\n" +
                "|8    ⬥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ⬥    |\n" +
                "| _____ 8|");
        deck.add(eight_diamonds);
        Card nine_diamonds = new Card(9, false, "NULL", "Diamonds", "Red", false, " ________\n" +
                "|9    ⬥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ⬥    |\n" +
                "| _____ 9|");
        deck.add(nine_diamonds);
        Card ten_diamonds = new Card(10, false, "NULL", "Diamonds", "Red", false, " ________\n" +
                "|10   ⬥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ⬥    |\n" +
                "| ____ 10|");
        deck.add(ten_diamonds);
        Card jack_diamonds = new Card(11, true, "Jack", "Diamonds", "Red", false, " ________\n" +
                "|J    ⬥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ⬥    |\n" +
                "| _____ J|");
        deck.add(jack_diamonds);
        Card queen_diamonds = new Card(12, true, "Queen", "Diamonds", "Red", false, " ________\n" +
                "|Q    ⬥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ⬥    |\n" +
                "| _____ Q|");
        deck.add(queen_diamonds);
        Card king_diamonds = new Card(13, true, "King", "Diamonds", "Red", false, " ________\n" +
                "|K    ⬥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ⬥    |\n" +
                "| _____ K|");
        deck.add(king_diamonds);
        Card ace_diamonds = new Card(14, true, "Ace", "Diamonds", "Red", false, " ________\n" +
                "|A    ⬥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ⬥    |\n" +
                "| _____ A|");
        deck.add(ace_diamonds);
        Card two_clubs = new Card(2, false, "NULL", "Clubs", "Black", false, " ________\n" +
                "|2     ♣ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♣     |\n" +
                "| _____ 2|");
        deck.add(two_clubs);
        Card three_clubs = new Card(3, false, "NULL", "Clubs", "Black", false, " ________\n" +
                "|3     ♣ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♣     |\n" +
                "| _____ 3|");
        deck.add(three_clubs);
        Card four_clubs = new Card(4, false, "NULL", "Clubs", "Black", false, " ________\n" +
                "|4     ♣ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♣     |\n" +
                "| _____ 4|");
        deck.add(four_clubs);
        Card five_clubs = new Card(5, false, "NULL", "Clubs", "Black", false, " ________\n" +
                "|5     ♣ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♣     |\n" +
                "| _____ 5|");
        deck.add(five_clubs);
        Card six_clubs = new Card(6, false, "NULL", "Clubs", "Black", false, " ________\n" +
                "|6     ♣ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♣     |\n" +
                "| _____ 6|");
        deck.add(six_clubs);
        Card seven_clubs = new Card(7, false, "NULL", "Clubs", "Black", false, " ________\n" +
                "|7     ♣ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♣     |\n" +
                "| _____ 7|");
        deck.add(seven_clubs);
        Card eight_clubs = new Card(8, false, "NULL", "Clubs", "Black", false, " ________\n" +
                "|8     ♣ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♣     |\n" +
                "| _____ 8|");
        deck.add(eight_clubs);
        Card nine_clubs = new Card(9, false, "NULL", "Clubs", "Black", false, " ________\n" +
                "|9     ♣ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♣     |\n" +
                "| _____ 9|");
        deck.add(nine_clubs);
        Card ten_clubs = new Card(10, false, "NULL", "Clubs", "Black", false, " ________\n" +
                "|10    ♣ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♣     |\n" +
                "| ____ 10|");
        deck.add(ten_clubs);
        Card jack_clubs = new Card(11, true, "Jack", "Clubs", "Black", false, " ________\n" +
                "|J     ♣ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♣     |\n" +
                "| _____ J|");
        deck.add(jack_clubs);
        Card queen_clubs = new Card(12, true, "Queen", "Clubs", "Black", false, " ________\n" +
                "|Q     ♣ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♣     |\n" +
                "| _____ Q|");
        deck.add(queen_clubs);
        Card king_clubs = new Card(13, true, "King", "Clubs", "Black", false, " ________\n" +
                "|K     ♣ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♣     |\n" +
                "| _____ K|");
        deck.add(king_clubs);
        Card ace_clubs = new Card(14, true, "Ace", "Clubs", "Black", false, " ________\n" +
                "|A     ♣ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♣     |\n" +
                "| _____ A|");
        deck.add(ace_clubs);
        Card two_spades = new Card(2, false, "NULL", "Spades", "Black", false, " ________\n" +
                "|2     ♠ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♠     |\n" +
                "| _____ 2|");
        deck.add(two_spades);
        Card three_spades = new Card(3, false, "NULL", "Spades", "Black", false, " ________\n" +
                "|3     ♠ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♠     |\n" +
                "| _____ 3|");
        deck.add(three_spades);
        Card four_spades = new Card(4, false, "NULL", "Spades", "Black", false, " ________\n" +
                "|4     ♠ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♠     |\n" +
                "| _____ 4|");
        deck.add(four_spades);
        Card five_spades = new Card(5, false, "NULL", "Spades", "Black", false, " ________\n" +
                "|5     ♠ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♠     |\n" +
                "| _____ 5|");
        deck.add(five_spades);
        Card six_spades = new Card(6, false, "NULL", "Spades", "Black", false, " ________\n" +
                "|6     ♠ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♠     |\n" +
                "| _____ 6|");
        deck.add(six_spades);
        Card seven_spades = new Card(7, false, "NULL", "Spades", "Black", false, " ________\n" +
                "|7     ♠ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♠     |\n" +
                "| _____ 7|");
        deck.add(seven_spades);
        Card eight_spades = new Card(8, false, "NULL", "Spades", "Black", false, " ________\n" +
                "|8     ♠ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♠     |\n" +
                "| _____ 8|");
        deck.add(eight_spades);
        Card nine_spades = new Card(9, false, "NULL", "Spades", "Black", false, " ________\n" +
                "|9     ♠ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♠     |\n" +
                "| _____ 9|");
        deck.add(nine_spades);
        Card ten_spades = new Card(10, false, "NULL", "Spades", "Black", false, " ________\n" +
                "|10    ♠ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♠     |\n" +
                "| ____ 10|");
        deck.add(ten_spades);
        Card jack_spades = new Card(11, true, "Jack", "Spades", "Black", false, " ________\n" +
                "|J     ♠ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♠     |\n" +
                "| _____ J|");
        deck.add(jack_spades);
        Card queen_spades = new Card(12, true, "Queen", "Spades", "Black", false, " ________\n" +
                "|Q     ♠ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♠     |\n" +
                "| _____ Q|");
        deck.add(queen_spades);
        Card king_spades = new Card(13, true, "King", "Spades", "Black", false, " ________\n" +
                "|K     ♠ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♠     |\n" +
                "| _____ K|");
        deck.add(king_spades);
        Card ace_spades = new Card(14, true, "Ace", "Spades", "Black", false, " ________\n" +
                "|A     ♠ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♠     |\n" +
                "| _____ A|");
        deck.add(ace_spades);
    }

    public void shuffle(){
        deck.addAll(used_deck);
        used_deck.removeAll(used_deck);
        Collections.shuffle(deck);
    }


    // Gets random card from deck, then moves card object from deck to used_deck
    public Card getCard(){

        // get random number and assign card object the card at the index
        Random random = new Random();
        int index = random.nextInt(0, deck.size());
        Card card = deck.get(index);

        // move card from deck to used_deck
        used_deck.add(card);
        deck.remove(index);

    return card;
    }

    // Return remaining unused cards
    int getRemainingUnused(){
        return deck.size();
    }

}
