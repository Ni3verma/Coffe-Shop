package Condiments;

import Beverage.Beverage;

/**
 * @author Nitin
 */
public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage b) {
        this.beverage = b;
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
