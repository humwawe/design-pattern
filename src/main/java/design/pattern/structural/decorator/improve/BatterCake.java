package design.pattern.structural.decorator.improve;

/**
 * @author hum
 */
public class BatterCake extends AbstractBatterCake {
    @Override
    protected String getDesc() {
        return "batter cake";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
