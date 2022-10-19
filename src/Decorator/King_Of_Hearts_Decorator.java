package src.Decorator;

import src.Log_output;

public class King_Of_Hearts_Decorator extends CardDrawerDecorator implements Log_output {

    public King_Of_Hearts_Decorator(CardDrawer decoratedCardDrawer){
        super(decoratedCardDrawer);
    }

    @Override public void draw()
    {
        out(" ________\n" +
                "|K     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ K|");
    }
}
