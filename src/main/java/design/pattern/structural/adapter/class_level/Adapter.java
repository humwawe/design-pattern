package design.pattern.structural.adapter.class_level;

/**
 * @author hum
 */
public class Adapter extends Original implements Target {
    @Override
    public void request() {
        //其他逻辑
        super.originalRequest();
    }
}
