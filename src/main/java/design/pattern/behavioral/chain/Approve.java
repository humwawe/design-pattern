package design.pattern.behavioral.chain;

/**
 * @author hum
 */
public abstract class Approve {
    protected Approve approve;

    public void setNextApprove(Approve approve) {
        this.approve = approve;
    }

    public abstract void deploy(Course course);
}
