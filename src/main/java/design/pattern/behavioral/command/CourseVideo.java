package design.pattern.behavioral.command;

/**
 * @author hum
 */
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(name + " open");
    }

    public void close() {
        System.out.println(name + " close");
    }
}
