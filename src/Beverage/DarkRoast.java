package Beverage;

/**
 * @author Nitin
 */
public class DarkRoast extends Beverage{
    @Override
    public int cost(){
        return super.cost() + 20;
    }
}
