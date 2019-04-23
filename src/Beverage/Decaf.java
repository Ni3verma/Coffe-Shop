package Beverage;

/**
 * @author Nitin
 */
public class Decaf extends Beverage {
    @Override
    public int cost(){
        return super.cost() + 40;
    }
}
