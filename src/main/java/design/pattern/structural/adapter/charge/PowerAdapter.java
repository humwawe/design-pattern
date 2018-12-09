package design.pattern.structural.adapter.charge;

/**
 * @author hum
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        //变压器...
        int adapterOutput = adapterInput / 44;

        System.out.println("input AC:" + adapterInput + "V  " + "output DC:" + adapterOutput + "V");
        return adapterOutput;
    }
}
