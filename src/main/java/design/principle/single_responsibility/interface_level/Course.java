package design.principle.single_responsibility.interface_level;

/**
 * @author hum
 */
public interface Course {
    String getCourseName();

    byte[] getCourseVideo();

    void studyCourse();

    void refundCourse();

}
