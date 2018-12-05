package design.pattern.creational.factory_method;

/**
 * @author hum
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        VideoFactory videoFactory2 = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }

}
