package design.pattern.structural.decorator.improve;

/**
 * @author hum
 */
public class Test {
    public static void main(String[] args) {
        AbstractBatterCake abstractBatterCake;
        abstractBatterCake = new BatterCake();
        abstractBatterCake = new EggDecorator(abstractBatterCake);
        abstractBatterCake = new EggDecorator(abstractBatterCake);
        abstractBatterCake = new SausageDecorator(abstractBatterCake);

        System.out.println(abstractBatterCake.getDesc() + " price:" + abstractBatterCake.cost());

    }
}
