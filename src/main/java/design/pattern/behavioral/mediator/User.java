package design.pattern.behavioral.mediator;

/**
 * @author hum
 */
public class User {
    String name;

    public void sendMessage(String message) {
        Group.showMessage(this, message);
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
