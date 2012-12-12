/**
 *
 * @author steff
 */

public class DieselTractor extends Tractor {
    
    private int consumedFuel; 
    
    public DieselTractor(int nr, Tool tool) {
        super(nr, tool);
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
        consumedFuel += amount.intValue();
    }
    
    @Override
    @Author(name = "Stefan Resch")
    public String toString() {
        return "diesel tractor, nr. " + getId() + ", consumed: " + getConsumption() + ", tool: " + getTool() + ", capacity: " + getTool().getCapacity();
    }
}
