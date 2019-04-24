package Beverage;

/**
 * @author Nitin
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        desc = "House blend";
    }

    @Override
    public int cost() {
        return 30;
    }
}
