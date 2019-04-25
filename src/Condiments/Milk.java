package Condiments;

import Beverage.Beverage;

/**
 * @author Nitin
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public int cost() {
        return beverage.cost() + 30;
    }

}
