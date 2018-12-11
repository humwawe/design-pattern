package design.pattern.behavioral.visitor;

/**
 * @author hum
 */
public class FreeCourse extends Course {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
