package design.pattern.structural.decorator.improve;

/**
 * @author hum
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " add an egg;";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}