package design.pattern.creational.factory_method;


/**
 * @author hum
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
