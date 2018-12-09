package design.pattern.creational.singleton.reflection;

/**
 * @author hum
 */
public class LazySingletonReflecion {
    private static LazySingletonReflecion lazySingletonReflecion = null;

    private LazySingletonReflecion() {
        //反射可能先进入，造成创造多个对象，所以无法防止反射攻击
        if (lazySingletonReflecion != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public synchronized static LazySingletonReflecion getInstance() {
        if (lazySingletonReflecion == null) {
            lazySingletonReflecion = new LazySingletonReflecion();
        }
        return lazySingletonReflecion;
    }
}
