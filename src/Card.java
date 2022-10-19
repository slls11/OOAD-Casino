package src;
/* This class contains the functionality of the individual card
   The deck of cards will be implemented in a different class
 */


import java.awt.*;

public class Card implements Log_output {

    /* attributes */

    // value of card from 2-14
    private int value;

    // determines if face card (helpful for blackjack)
    private boolean isFaceCard;

    // Jack, Queen, or King
    private String faceCardType;

    // Spades, Clubs, Hearts, Diamonds
    private String suit;

    // Black or white
    private String color;

    // If card has already been used in a game
    private boolean used;

    // String containing card to print to screen
    public String cardArt;

    // src.Card constructor
    public Card (int value, boolean isFaceCard, String faceCardType,
                 String suit, String color, boolean used, String cardArt){

        this.value = value;
        this.isFaceCard = isFaceCard;
        this.faceCardType = faceCardType;
        this.suit = suit;
        this.color = color;
        this.used = used;
        this.cardArt = cardArt;
    }

    // getters and the setters for the attributes
    public int getValue(){
        return value;
    }
    public boolean getIsFaceCard(){
        return isFaceCard;
    }

    public String getFaceCardType(){
        return faceCardType;
    }
    String getSuit() {
        return suit;
    }
    String getColor(){
        return color;
    }
    public boolean getUsed(){
        return used;
    }
    public void setUsed(boolean used){
        this.used = used;
    }

    public void draw() { out(cardArt);}


}
