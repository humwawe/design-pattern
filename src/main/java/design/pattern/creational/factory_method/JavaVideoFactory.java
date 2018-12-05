package design.pattern.creational.factory_method;

/**
 * @author hum
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
