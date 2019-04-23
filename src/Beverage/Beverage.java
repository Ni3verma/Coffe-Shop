package Beverage;

/**
 * @author Nitin
 */
public class Beverage {

    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;

    private final int MILK_COST = 30;
    private final int SOY_COST = 20;
    private final int MOCHA_COST = 50;
    private final int WHIP_COST = 60;

    public int cost() {
        int total = 0;
        if (isMilk()) {
            total += MILK_COST;
        }
        if (isSoy()) {
            total += SOY_COST;
        }
        if (isMocha()) {
            total += MOCHA_COST;
        }
        if (isWhip()) {
            total += WHIP_COST;
        }
        return total;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

}
