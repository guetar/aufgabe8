
/**
 *
 * @author guetar
 */
public class Bauernhof extends Node {
    
    private final String name;
    private Set traktoren;
    
    public Bauernhof(String name) {
        super("bauernhof_" + name);
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void insertTraktor(Traktor b) {
        traktoren.insert(b);
    }
    
    public void removeTraktor(Traktor b) {
        traktoren.remove(b.getId());
    }
}