package Condiments;

import Beverage.Beverage;

/**
 * @author Nitin
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public int cost() {
        return beverage.cost() + 20;
    }

}
