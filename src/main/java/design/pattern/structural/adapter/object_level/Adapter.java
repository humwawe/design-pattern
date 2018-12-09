package design.pattern.structural.adapter.object_level;

/**
 * @author hum
 */
public class Adapter implements Target {
    private Original original = new Original();

    @Override
    public void request() {
        original.originalRequest();
    }
}
