package design.pattern.creational.singleton;

/**
 * @author hum
 */
public class LazyDoubleCheckSingleton {
    //初始化对象的，3可能重排序，导致某个线程看到了还没完成的创建的对象，引用后报错
    //使用volatile内存对多线程有可见性，缓存一致性，可以禁止重排序
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        //不加在这个，就跟LazySingleton性质一样了，加锁前检查为了提高性能
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
//                  //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    //2.初始化对象
//                    intra-thread semantics java允许不影响（单线程）结果的重排序

                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
