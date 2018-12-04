package design.principle.dependence_inversion;

/**
 * @author hum
 */
public class Test {
    public static void main(String[] args) {
        Hum hum = new Hum();
        hum.setCourse(new JavaCourse());
        hum.studyCourse();

        hum.setCourse(new FECourse());
        hum.studyCourse();

    }
}
