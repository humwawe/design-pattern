package design.pattern.structural.adapter.charge;

/**
 * @author hum
 */
public class AC220 {
    public int outputAC220V() {
        int output = 220;
        System.out.println("output AC:" + output + "V");
        return output;
    }
}
