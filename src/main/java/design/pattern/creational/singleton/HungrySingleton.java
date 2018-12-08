package design.pattern.creational.singleton;

/**
 * @author hum
 */
public class HungrySingleton {
    //饿汉式，类加载时就初始化了
    private final static HungrySingleton HUNGRY_SINGLETON;

    static {
        HUNGRY_SINGLETON = new HungrySingleton();
    }

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}
