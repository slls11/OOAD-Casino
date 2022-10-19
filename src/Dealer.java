package src;

import java.util.ArrayList;
import src.Decorator.*;

public class Dealer {

    /* Attributes */

    // SINGLETON PATTERN
    private static Dealer dealer;

    private String name;

    private int boardPosition;

    public ArrayList<Card> Hand = new ArrayList<>();

    private double bankRoll;

    // methods

    // Dealer constructor - private for singleton use
    private Dealer(String name, int boardPosition, double bankRoll){
        this.name = name;
        this.boardPosition = boardPosition;
        this.bankRoll = bankRoll;
    }

    public static Dealer getDealer(){
        // create object if it's not already created
        if(dealer == null) {
            dealer = new Dealer("Dealer", 1, 1000.00);
        }

        // returns the singleton object
        return dealer;
    }



    public String getName(){
        return this.name;
    }

    public double getBoardPosition(){
        return this.boardPosition;
    }

    public double getBankRoll(){
        return this.bankRoll;
    }

    public void setBankRoll(double handAmount){
        this.bankRoll += handAmount;
    }

    public int countHand(){
        int sum = 0;
        for (int i = 0; i < Hand.size(); i++) {
            // this adds 10 for any face card except an ace
            if (Hand.get(i).getIsFaceCard() && Hand.get(i).getValue() < 14){
                sum += 10;
            }
            // this adds a 1 or 11 for an ace depending on the users hand count
            else if(Hand.get(i).getIsFaceCard()){
                if (sum + 11 <= 21){
                    sum += 11;
                }
                else {
                    sum += 1;
                }
            }
            else{
                sum = sum + Hand.get(i).getValue();

            }
        }
        return sum;
    }
}
