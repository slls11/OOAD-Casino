package src.Decorator;

import src.Log_output;

public class Ace_Of_Hearts_Decorator extends CardDrawerDecorator implements Log_output {

    public Ace_Of_Hearts_Decorator(CardDrawer decoratedCardDrawer){
        super(decoratedCardDrawer);
    }

    @Override public void draw()
    {
        out(" ________\n" +
                "|A     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ A|");
    }
}
