package design.pattern.creational.singleton.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author hum
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        function1();
//        function2();
        function3();
    }

    private static void function1() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class objectClass = HungrySingletonReflection.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingletonReflection instance = HungrySingletonReflection.getInstance();
        HungrySingletonReflection newInstance = (HungrySingletonReflection) constructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }


    private static void function2() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class objectClass = StaticInnerClassSingletonReflection.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticInnerClassSingletonReflection instance = StaticInnerClassSingletonReflection.getInstance();
        StaticInnerClassSingletonReflection newInstance = (StaticInnerClassSingletonReflection) constructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }

    private static void function3() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class objectClass = LazySingletonReflecion.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        //下面两行的顺序会影响执行的结果
        LazySingletonReflecion newInstance = (LazySingletonReflecion) constructor.newInstance();
        LazySingletonReflecion instance = LazySingletonReflecion.getInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
