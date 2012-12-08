
/**
 *
 * @author guetar
 */
public class Farm extends Node {
    
    private final String name;
    private Set tractors;
    
    public Farm(String name) {
        super("farm_" + name);
        this.name = name;
        this.tractors = new Set();
    }
    
    public String getName() {
        return name;
    }
    
    public Set getTractors() {
        return tractors;
    }
    
    public void insertTractor(Tractor b) {
        tractors.insert(b);
    }
    
    public void removeTractor(String id) {
        tractors.remove(id);
    }
    
    public void changeTractor() {
        
    }
    
    public String getStatHoursForTools() {
        Statistic stat = new Statistic(tractors.iterator());
        return stat.hoursForTools();
    }
    
    public String getStatHoursForTractors() {
        Statistic stat = new Statistic(tractors.iterator());
        return stat.hoursForTractors();
    }
    
    public String getStatDieselTractors() {
        Statistic stat = new Statistic(tractors.iterator());
        return stat.ConsumptionForDieselTractors();
    }
    
    public String getStatGasTractors() {
        Statistic stat = new Statistic(tractors.iterator());
        return stat.ConsumptionForGasTractors();
    }
}