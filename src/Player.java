package src;

import java.util.ArrayList;
import src.Decorator.*;

// User object
public class Player {

    /* Attributes */

    private String name;

    private int boardPosition;

    public ArrayList<Card> Hand = new ArrayList<>();

    private double bankRoll;

    private double currentBet;


    // methods

    // Player constructor
    public Player(String name, int boardPosition, double bankRoll){
        this.name = name;
        this.boardPosition = boardPosition;
        this.bankRoll = bankRoll;
    }

    public void setBet(double betAmount){
        currentBet = betAmount;
    }

    public double getBet(){
        return currentBet;
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
