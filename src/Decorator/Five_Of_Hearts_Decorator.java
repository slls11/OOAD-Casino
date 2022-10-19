package src.Decorator;

import src.Log_output;

public class Five_Of_Hearts_Decorator extends CardDrawerDecorator implements Log_output {

    public Five_Of_Hearts_Decorator(CardDrawer decoratedCardDrawer){
        super(decoratedCardDrawer);
    }

    @Override public void draw()
    {
        out(" ________\n" +
                "|5     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ 5|");
    }
}
