package design.pattern.structural.decorator.base;

/**
 * @author hum
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc() + " add a sausage";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
