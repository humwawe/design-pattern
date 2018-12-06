package design.pattern.creational.singleton;

/**
 * @author hum
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    // 普通的单例存在线程安全问题，加synchronized后安全，但此种方法开销较大，修饰static锁的是class，范围较大
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
