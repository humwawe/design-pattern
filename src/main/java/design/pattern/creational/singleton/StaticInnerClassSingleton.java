package design.pattern.creational.singleton;

/**
 * @author hum
 */
public class StaticInnerClassSingleton {
    //静态内部类保证只有一个线程拿到初始化class的锁，即使class初始化重排序，其他线程也无法看到
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
}
