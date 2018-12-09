package design.pattern.structural.facade;

/**
 * @author hum
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        //扣减积分
        System.out.println("pay success " + pointsGift.getName());
        return true;
    }

}
