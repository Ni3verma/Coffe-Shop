package Condiments;

import Beverage.Beverage;

/**
 * @author Nitin
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage b) {
        beverage = b;
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
