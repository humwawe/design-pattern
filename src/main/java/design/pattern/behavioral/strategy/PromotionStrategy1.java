package design.pattern.behavioral.strategy;

/**
 * @author hum
 */
public class PromotionStrategy1 implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("Strategy1");
    }
}