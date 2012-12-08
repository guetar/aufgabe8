
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
    
    public int getAverageHours() {
        Iterator it = tractors.iterator();
        int avg = 0;
        
        while(it.hasNext()) {
            Node n = it.next();
            //if (n instanceof )
        }
        
        return 0;
    }
}