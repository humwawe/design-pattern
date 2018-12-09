package design.pattern.creational.singleton.reflection;

/**
 * @author hum
 */
public class HungrySingletonReflection {
    //饿汉式，类加载时就初始化了
    private final static HungrySingletonReflection HUNGRY_SINGLETON_REFLECTION;

    static {
        HUNGRY_SINGLETON_REFLECTION = new HungrySingletonReflection();
    }

    private HungrySingletonReflection() {
        //防止反射调用生成对象
        if (HUNGRY_SINGLETON_REFLECTION != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingletonReflection getInstance() {
        return HUNGRY_SINGLETON_REFLECTION;
    }
}
