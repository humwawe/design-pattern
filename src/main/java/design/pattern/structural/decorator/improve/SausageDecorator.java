package design.pattern.structural.decorator.improve;

/**
 * @author hum
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " add a sausage;";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}