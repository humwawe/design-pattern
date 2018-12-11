package design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hum
 */
public class Test {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();
        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("freeCourse");
        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("codingCourse");
        codingCourse.setPrice("299");

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {
            course.accept(new Visitor());
        }
        for (Course course : courseList) {
            course.accept(new BossVisitor());
        }
    }
}
