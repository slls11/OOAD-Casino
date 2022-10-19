package src.Decorator;

import src.Log_output;

public class Three_Of_Hearts_Decorator extends CardDrawerDecorator implements Log_output {

    public Three_Of_Hearts_Decorator(CardDrawer decoratedCardDrawer){
        super(decoratedCardDrawer);
    }

    @Override public void draw()
    {
        out(" ________\n" +
                "|3     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ 3|");
    }
}
