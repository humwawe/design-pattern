package design.pattern.creational.singleton.clone;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author hum
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HungrySingletonClone hungrySingletonClone = HungrySingletonClone.getInstance();
        Method method = hungrySingletonClone.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingletonClone hungrySingletonClone2 = (HungrySingletonClone) method.invoke(hungrySingletonClone);
        System.out.println(hungrySingletonClone);
        System.out.println(hungrySingletonClone2);
    }
}
