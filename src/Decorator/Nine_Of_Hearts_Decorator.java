package src.Decorator;

import src.Log_output;

public class Nine_Of_Hearts_Decorator extends CardDrawerDecorator implements Log_output {

    public Nine_Of_Hearts_Decorator(CardDrawer decoratedCardDrawer){
        super(decoratedCardDrawer);
    }

    @Override public void draw()
    {
        out(" ________\n" +
                "|9     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| _____ 9|");
    }
}
