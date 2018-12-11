package design.pattern.behavioral.chain;

/**
 * @author hum
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course();
        course.setName("hum");
        course.setVideo("video");
        Approve nameApprove = new NameApprove();
        Approve videoApprove = new VideoApprove();

        nameApprove.setNextApprove(videoApprove);
        nameApprove.deploy(course);
    }
}
