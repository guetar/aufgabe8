
/**
 *
 * @author guetar
 */

@Author(name = "Günther Bernsteiner")
public class Farm extends Node {
    
    private final String name;
    private Set tractors;
    
    public Farm(String name) {
        super(name);
        this.name = name;
        this.tractors = new Set();
    }
    
    @Author(name = "Günther Bernsteiner")
    public String getName() {
        return name;
    }
    
    @Author(name = "Günther Bernsteiner")
    public Set getTractors() {
        return tractors;
    }
    
    //rekursive Suche nach dem Traktor mit der angegebenen Nummer
    //NB: returns den gesuchten Traktor oder null,wenn kein Knoten mit der 
    //angegebenen id existiert
    @Author(name = "Matthias Vigele")    
    public Tractor getTractor(int nr){
    return (Tractor) tractors.getNode(String.valueOf(nr));
    }
    
    @Author(name = "Günther Bernsteiner")    
    public void insertTractor(Tractor b) {
        tractors.insert(b);
    }
    
    @Author(name = "Günther Bernsteiner")
    public void removeTractor(String id) {
        tractors.remove(id);
    }
    
    @Author(name = "Günther Bernsteiner")
    public void changeTractor() {
        
    }
    
    @Author(name = "Stefan Resch")
    public String hoursForTools() {
       Statistic stat = new Statistic(tractors.iterator());
       return stat.hoursForTools();
    }
    
    @Author(name = "Stefan Resch")
    public String hoursForTractors() {
       Statistic stat = new Statistic(tractors.iterator());
       return stat.hoursForTractors();
    }
    
    @Author(name = "Stefan Resch")
    public String ConsumptionForDieselTractors() {
       Statistic stat = new Statistic(tractors.iterator());
       return stat.ConsumptionForDieselTractors();
    }
    
    @Author(name = "Stefan Resch")
    public String ConsumptionForGasTractors() {
       Statistic stat = new Statistic(tractors.iterator());
       return stat.ConsumptionForGasTractors();
    }
}
