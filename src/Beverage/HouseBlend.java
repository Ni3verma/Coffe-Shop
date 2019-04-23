package Beverage;

/**
 * @author Nitin
 */
public class HouseBlend extends Beverage{
    @Override
    public int cost(){
        return super.cost() + 30;
    }
}
