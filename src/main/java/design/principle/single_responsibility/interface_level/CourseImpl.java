package design.principle.single_responsibility.interface_level;

/**
 * @author hum
 */
public class CourseImpl implements CourseManager,CourseContent{
    public String getCourseName() {
        return null;
    }

    public byte[] getCourseVideo() {
        return new byte[0];
    }

    public void studyCourse() {

    }

    public void refundCourse() {

    }
}
