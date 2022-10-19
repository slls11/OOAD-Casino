package src.Decorator;

import src.Log_output;

public class Queen_Of_Hearts_Decorator extends CardDrawerDecorator implements Log_output {

    public Queen_Of_Hearts_Decorator(CardDrawer decoratedCardDrawer){
        super(decoratedCardDrawer);
    }

    @Override public void draw()
    {
        out(" ________\n" +
                "|Q     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ Q|");
    }
}
