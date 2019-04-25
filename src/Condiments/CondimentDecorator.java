package Condiments;

import Beverage.Beverage;

/**
 * @author Nitin
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
