package Beverage;

/**
 * @author Nitin
 */
public class Espresso extends Beverage {

    public Espresso() {
        desc = "Espresso";
    }

    @Override
    public int cost() {
        return 30;
    }
}
