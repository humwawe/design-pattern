package design.pattern.structural.decorator.base;

/**
 * @author hum
 */
public class BatterCakeWithEgg extends BatterCake {
    @Override
    public String getDesc() {
        return super.getDesc() + " add an egg";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
