package Beverage;

/**
 * @author Nitin
 */
public class Espresso extends Beverage{
    @Override
    public int cost(){
        return super.cost() + 30;
    }
}
