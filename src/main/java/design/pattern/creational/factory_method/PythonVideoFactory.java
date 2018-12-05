package design.pattern.creational.factory_method;

/**
 * @author hum
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}