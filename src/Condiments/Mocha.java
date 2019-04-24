package Condiments;

import Beverage.Beverage;

/**
 * @author Nitin
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage b) {
        this.beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public int cost() {
        return beverage.cost() + 50;
    }

}
