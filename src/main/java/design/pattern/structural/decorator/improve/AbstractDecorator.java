package design.pattern.structural.decorator.improve;

/**
 * @author hum
 * 装饰模式若不继承AbstractBatterCake，跟桥接很像
 * 继承表达了本类是一个装饰的，是跟原来来自同一个父类的
 * 桥接不继承，显得只是一座桥而已
 */
public abstract class AbstractDecorator extends AbstractBatterCake {
    private AbstractBatterCake abstractBatterCake;

    public AbstractDecorator(AbstractBatterCake abstractBatterCake) {
        this.abstractBatterCake = abstractBatterCake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.abstractBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return this.abstractBatterCake.cost();
    }
}