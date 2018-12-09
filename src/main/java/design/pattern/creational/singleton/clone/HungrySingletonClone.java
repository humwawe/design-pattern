package design.pattern.creational.singleton.clone;

/**
 * @author hum
 */
public class HungrySingletonClone implements Cloneable {
    //饿汉式，类加载时就初始化了
    private final static HungrySingletonClone HUNGRY_SINGLETON_CLONE;

    static {
        HUNGRY_SINGLETON_CLONE = new HungrySingletonClone();
    }

    private HungrySingletonClone() {
    }

    public static HungrySingletonClone getInstance() {
        return HUNGRY_SINGLETON_CLONE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //默认实现直接返回会导致clone新的对象，从而破坏单例
        //return super.clone();
        return getInstance();
    }
}
