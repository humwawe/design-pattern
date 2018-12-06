package design.principle.dependence_inversion;

/**
 * @author hum
 */
public class JavaCourse implements Course {
    @Override
    public void studyCourse() {
        System.out.println("hum在学习Java课程");
    }
}
