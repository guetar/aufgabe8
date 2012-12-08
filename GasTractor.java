/**
 *
 * @author steff
 */
public class GasTractor extends Tractor {

    private double consumedGas; 
    
    public GasTractor(int nr) {
        super(nr);
    }
    
    @Override
    public Double getConsumption() {
        return consumedGas;
    }

    @Override
    //VB: amount soll Double sein
    public void raiseConsumption(Number amount) {
        consumedGas += amount.doubleValue();
    }
}
