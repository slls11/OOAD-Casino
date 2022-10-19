package src.Decorator;

import src.Log_output;

public class Seven_Of_Hearts_Decorator extends CardDrawerDecorator implements Log_output {

    public Seven_Of_Hearts_Decorator(CardDrawer decoratedCardDrawer){
        super(decoratedCardDrawer);
    }

    @Override public void draw()
    {
        out(" ________\n" +
                "|7     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ 7|");
    }
}
