package design.pattern.structural.facade;

/**
 * @author hum
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        //校验资格
        System.out.println("check qualify success " + pointsGift.getName());
        return true;
    }
}
