package decoratorpattern;

import Beverage.Beverage;
import Beverage.HouseBlend;

/**
 * @author nitin
 */
public class DecoratorPattern {

    public static void main(String[] args) {
        Beverage b = new HouseBlend();
        b.setMilk(true);
        System.out.println("total cost = "+b.cost());
    }

}
