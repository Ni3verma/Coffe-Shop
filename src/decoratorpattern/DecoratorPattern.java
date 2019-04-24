package decoratorpattern;

import Beverage.Beverage;
import Beverage.DarkRoast;
import Beverage.Espresso;
import Beverage.HouseBlend;
import Condiments.Mocha;
import Condiments.Whip;

/**
 * @author nitin
 */
public class DecoratorPattern {

    public static void main(String[] args) {
        Beverage b1 = new Espresso();
        System.out.println("Beverage 1 : ");
        System.out.println(b1.getDescription() + " Rs." + b1.cost());
        System.out.println("");
        
        Beverage b2 = new DarkRoast();
        b2 = new Mocha(b2);
        b2 = new Whip(b2);
        System.out.println("Beverage 2 : ");
        System.out.println(b2.getDescription() + " Rs." + b2.cost());
    }

}
