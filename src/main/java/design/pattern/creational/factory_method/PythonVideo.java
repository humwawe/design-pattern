package design.pattern.creational.factory_method;

/**
 * @author hum
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
