package design.pattern.behavioral.visitor;

/**
 * @author hum
 */
public interface IVisitor {
    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}
