package design.pattern.creational.singleton.reflection;

import design.pattern.creational.singleton.StaticInnerClassSingleton;

/**
 * @author hum
 */
public class StaticInnerClassSingletonReflection {
    //静态内部类保证只有一个线程拿到初始化class的锁，即使class初始化重排序，其他线程也无法看到
    private static class InnerClass {
        private static StaticInnerClassSingletonReflection staticInnerClassSingletonReflection = new StaticInnerClassSingletonReflection();
    }

    private StaticInnerClassSingletonReflection() {
        if (InnerClass.staticInnerClassSingletonReflection != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static StaticInnerClassSingletonReflection getInstance() {
        return InnerClass.staticInnerClassSingletonReflection;
    }
}
