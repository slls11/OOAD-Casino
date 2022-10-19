package src.Decorator;

import src.Log_output;

public class Six_Of_Hearts_Decorator extends CardDrawerDecorator implements Log_output {

    public Six_Of_Hearts_Decorator(CardDrawer decoratedCardDrawer){
        super(decoratedCardDrawer);
    }

    @Override public void draw()
    {
        out(" ________\n" +
                "|6     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ 6|");
    }
}
