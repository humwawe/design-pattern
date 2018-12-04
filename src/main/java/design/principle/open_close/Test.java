package design.principle.open_close;

/**
 * @author hum
 */
public class Test {
    public static void main(String[] args) {
        Course Course = new JavaDiscountCourse(96, "Java从零到企业级电商开发", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) Course;
        System.out.println("课程ID:" + javaCourse.getId() + " 课程名称:" + javaCourse.getName() + " 课程原价:" + javaCourse.getPrice() + " 课程折后价格:" + javaCourse.getDiscountPrice() + "元");


    }
}
