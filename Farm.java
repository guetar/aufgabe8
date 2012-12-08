
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
    
    //rekursive Suche nach dem Traktor mit der angegebenen Nummer
    //NB: returns den gesuchten Traktor oder null,wenn kein Knoten mit der 
    //angegebenen id existiert
    public Tractor getTractor(int nr){
    return (Tractor) tractors.getNode(String.valueOf(nr));
    }
    
    public void insertTractor(Tractor b) {
        tractors.insert(b);
    }
    
    public void removeTractor(String id) {
        tractors.remove(id);
    }
    
    public void changeTractor() {
        
    }
}