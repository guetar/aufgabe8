/**
 *
 * @author steff
 */

@Author(name = "Stefan Resch")

public class DieselTractor extends Tractor {
    
    private int consumedFuel; 
    
    public DieselTractor(int nr) {
        super(nr);
    }
    
    @Override
    @Author(name = "Stefan Resch")
    public Integer getConsumption() {
        return consumedFuel;
    }

    @Override
    @Author(name = "Stefan Resch")
    //VB: amount soll Integer sein
    public void IncreaseConsumption(Number amount) {
        consumedFuel += (Integer) amount;
    }
}
