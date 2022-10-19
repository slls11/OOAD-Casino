package src.Decorator;

import src.Log_output;

public class Four_Of_Hearts_Decorator extends CardDrawerDecorator implements Log_output {

    public Four_Of_Hearts_Decorator(CardDrawer decoratedCardDrawer){
        super(decoratedCardDrawer);
    }

    @Override public void draw()
    {
        out(" ________\n" +
                "|4     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ 4|");
    }
}
