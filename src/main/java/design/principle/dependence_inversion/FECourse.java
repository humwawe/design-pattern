package design.principle.dependence_inversion;

/**
 * @author hum
 */
public class FECourse implements Course {

    @Override
    public void studyCourse() {
        System.out.println("hum在学习FE课程");
    }

}
