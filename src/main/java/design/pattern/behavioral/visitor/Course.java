package design.pattern.behavioral.visitor;

/**
 * @author hum
 */
public abstract class Course {
    private String name;

    public abstract void accept(IVisitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
