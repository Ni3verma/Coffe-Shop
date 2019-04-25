package Condiments;

import Beverage.Beverage;

/**
 * @author Nitin
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public int cost() {
        return beverage.cost() + 60;
    }

}
