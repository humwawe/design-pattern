package design.pattern.structural.facade;

/**
 * @author hum
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        //物流系统对接
        System.out.println("ship success " + pointsGift.getName());
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
