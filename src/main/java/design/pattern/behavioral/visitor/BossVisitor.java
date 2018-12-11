package design.pattern.behavioral.visitor;

/**
 * @author hum
 */
public class BossVisitor implements IVisitor {
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("free:" + freeCourse.getName());
        System.out.println("other data");
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("coding:" + codingCourse.getName() + " price:" + codingCourse.getPrice());
        System.out.println("other data");
    }
}
