package Beverage;

/**
 * @author Nitin
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        desc = "Dark roast";
    }

    @Override
    public int cost() {
        return 20;
    }
}
