
/**
 *
 * @author guetar
 */

@Author(name = "Günther Bernsteiner")

public class Farm extends Node {
    
    private final String name;
    private Set tractors;
    
    public Farm(String name) {
        super("farm_" + name);
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
