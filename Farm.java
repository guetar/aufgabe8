
/**
 *
 * @author guetar
 */

@Author(name = "Guenther Bernsteiner")
public class Farm extends Node {
    
    private final String name;
    private Set tractors;
    private Statistic stat;
    
    public Farm(String name) {
        super(name);
        this.name = name;
        this.tractors = new Set();
        this.stat = new Statistic();
    }
    
    @Author(name = "Guenther Bernsteiner")
    public String getName() {
        return name;
    }
    
    @Author(name = "Guenther Bernsteiner")
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
    
    @Author(name = "Guenther Bernsteiner")    
    public void insertTractor(Tractor b) {
        tractors.insert(b);
    }
    
    @Author(name = "Guenther Bernsteiner")
    public void removeTractor(String id) {
        tractors.remove(id);
    }
    
    @Author(name = "Guenther Bernsteiner")
    public void changeTractor() {
        
    }
    
    @Author(name = "Stefan Resch")
    public String hoursForTools() {
       return stat.hoursForTools(tractors.iterator());
    }
    
    @Author(name = "Stefan Resch")
    public String hoursForTractors() {
       return stat.hoursForTractors(tractors.iterator());
    }
    
    @Author(name = "Stefan Resch")
    public String ConsumptionForDieselTractors() {
       return stat.ConsumptionForDieselTractors(tractors.iterator());
    }
    
    @Author(name = "Stefan Resch")
    public String ConsumptionForGasTractors() {
       return stat.ConsumptionForGasTractors(tractors.iterator());
    }
    
    @Author(name = "Stefan Resch")
    public String MinMaxDrill() {
       return stat.getMinMaxDrill(tractors.iterator());
    }
    
    @Author(name = "Stefan Resch")
    public String averageCapacity() {
       return stat.getAverageCapacity(tractors.iterator());
    }
}
