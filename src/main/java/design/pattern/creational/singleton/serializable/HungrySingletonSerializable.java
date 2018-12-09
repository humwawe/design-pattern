package design.pattern.creational.singleton.serializable;

import java.io.Serializable;

/**
 * @author hum
 */
public class HungrySingletonSerializable implements Serializable {
    //饿汉式，类加载时就初始化了
    private final static HungrySingletonSerializable HUNGRY_SINGLETON_SERIALIZABLE;

    static {
        HUNGRY_SINGLETON_SERIALIZABLE = new HungrySingletonSerializable();
    }

    private HungrySingletonSerializable() {
    }

    public static HungrySingletonSerializable getInstance() {
        return HUNGRY_SINGLETON_SERIALIZABLE;
    }

    //在序列化的时候会生成新的对象，这个函数保证返回一致（会被反射调用）
    private Object readResolve() {
        return HUNGRY_SINGLETON_SERIALIZABLE;
    }
}
