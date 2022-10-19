package src.Decorator;

/* abstract class implementing CardDrawer class */
public abstract class CardDrawerDecorator implements CardDrawer {

    // Protected variable
    protected CardDrawer decoratedCardDrawer;

    // Abstract class method
    public CardDrawerDecorator(CardDrawer decoratedCardDrawer)
    {
        // This keyword refers to current object itself
        this.decoratedCardDrawer = decoratedCardDrawer;
    }

    // Method 2 - draw()
    // Outside abstract class
    public void draw() { decoratedCardDrawer.draw(); }
}
