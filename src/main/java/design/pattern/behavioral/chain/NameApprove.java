package design.pattern.behavioral.chain;

/**
 * @author hum
 */
public class NameApprove extends Approve {
    @Override
    public void deploy(Course course) {
        if (course.getName() != null) {
            System.out.println("has name, go next");
            if (approve != null) {
                approve.deploy(course);
            }
        } else {
            System.out.println("no name, stop");
        }
    }
}
