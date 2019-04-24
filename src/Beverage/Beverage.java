package Beverage;

/**
 * @author Nitin
 */
public abstract class Beverage {
    String desc = "unknown beverage";

    public String getDescription() {
        return desc;
    }

    public abstract int cost();
}
