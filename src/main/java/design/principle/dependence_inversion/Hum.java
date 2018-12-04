package design.principle.dependence_inversion;

/**
 * @author hum
 */
public class Hum {
    public void setCourse(Course course) {
        this.course = course;
    }

    private Course course;

    public void studyCourse() {
        course.studyCourse();
    }
}
