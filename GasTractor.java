/**
 *
 * @author steff
 */

@Author(name = "Stefan Resch")
public class GasTractor extends Tractor {

    private double consumedGas; 
    
    public GasTractor(int nr) {
        super(nr);
    }
    
    @Override
    @Author(name = "Stefan Resch")
    public Double getConsumption() {
        return consumedGas;
    }

    @Override
    @Author(name = "Stefan Resch")
    //VB: amount soll Double sein
    public void IncreaseConsumption(Number amount) {
        consumedGas += amount.doubleValue();
    }
}
