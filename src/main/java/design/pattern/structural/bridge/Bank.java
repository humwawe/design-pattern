package design.pattern.structural.bridge;

/**
 * @author hum
 * 抽象类使用了接口
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();

}
