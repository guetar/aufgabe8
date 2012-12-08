/**
 *
 * @author steff
 */
public class DieselTractor extends Tractor {
    
    private int consumedFuel; 
    
    public DieselTractor(int nr) {
        super(nr);
    }
    
    @Override
    public Integer getConsumption() {
        return consumedFuel;
    }

    @Override
    //VB: amount soll Integer sein
    public void raiseConsumption(Number amount) {
        consumedFuel += amount.intValue();
    }
}
