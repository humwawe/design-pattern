package design.principle.dependence_inversion;

/**
 * @author hum
 */
public class PythonCourse implements Course {

    @Override
    public void studyCourse() {
        System.out.println("hum在学习Python课程");
    }
}
