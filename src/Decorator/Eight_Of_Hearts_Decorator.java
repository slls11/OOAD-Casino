package src.Decorator;

import src.Log_output;

public class Eight_Of_Hearts_Decorator extends CardDrawerDecorator implements Log_output {

    public Eight_Of_Hearts_Decorator(CardDrawer decoratedCardDrawer){
        super(decoratedCardDrawer);
    }

    @Override public void draw()
    {
        out(" ________\n" +
                "|8     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ 8|");
    }
}
