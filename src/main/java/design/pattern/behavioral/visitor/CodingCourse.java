package design.pattern.behavioral.visitor;

/**
 * @author hum
 */
public class CodingCourse extends Course {
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
