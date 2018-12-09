package design.pattern.creational.singleton.serializable;

import java.io.*;

/**
 * @author hum
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingletonSerializable instance = HungrySingletonSerializable.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        HungrySingletonSerializable newInstance = (HungrySingletonSerializable) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
