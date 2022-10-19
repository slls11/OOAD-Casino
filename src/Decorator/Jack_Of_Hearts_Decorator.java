package src.Decorator;

import src.Log_output;

public class Jack_Of_Hearts_Decorator extends CardDrawerDecorator implements Log_output {

    public Jack_Of_Hearts_Decorator(CardDrawer decoratedCardDrawer){
        super(decoratedCardDrawer);
    }

    @Override public void draw()
    {
        out(" ________\n" +
                "|J     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ J|");
    }
}
