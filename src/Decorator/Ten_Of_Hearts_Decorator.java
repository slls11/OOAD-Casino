package src.Decorator;

import src.Log_output;

public class Ten_Of_Hearts_Decorator extends CardDrawerDecorator implements Log_output {

    public Ten_Of_Hearts_Decorator(CardDrawer decoratedCardDrawer){
        super(decoratedCardDrawer);
    }

    @Override public void draw()
    {
        out(" ________\n" +
                "|10     ♥ |\n" +
                "|        |\n" +
                "|        |\n" +
                "|  ♥     |\n" +
                "| ____ 10|");
    }
}
