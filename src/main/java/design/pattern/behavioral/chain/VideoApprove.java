package design.pattern.behavioral.chain;

/**
 * @author hum
 */
public class VideoApprove extends Approve {
    @Override
    public void deploy(Course course) {

        if (course.getVideo() != null) {
            System.out.println("has video, go next");
            if (approve != null) {
                approve.deploy(course);
            }
        } else {
            System.out.println("no video, stop");
        }
    }
}
