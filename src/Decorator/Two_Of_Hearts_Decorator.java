package src.Decorator;

import src.Log_output;

public class Two_Of_Hearts_Decorator extends CardDrawerDecorator implements Log_output {

    public Two_Of_Hearts_Decorator(CardDrawer decoratedCardDrawer){
        super(decoratedCardDrawer);
    }

    @Override public void draw()
    {
        out(" ________\n" +
                "|2     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ 2|");
    }
}
