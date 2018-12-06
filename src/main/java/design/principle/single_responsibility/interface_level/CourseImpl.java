package design.principle.single_responsibility.interface_level;

/**
 * @author hum
 */
public class CourseImpl implements CourseManager,CourseContent{
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
