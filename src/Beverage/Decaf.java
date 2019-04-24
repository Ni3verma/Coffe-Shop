package Beverage;

/**
 * @author Nitin
 */
public class Decaf extends Beverage {

    public Decaf() {
        desc = "Decaf";
    }

    @Override
    public int cost() {
        return 40;
    }
}
