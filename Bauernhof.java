
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
        this.traktoren = new Set();
    }
    
    public String getName() {
        return name;
    }
    
    public Set getTraktoren() {
        return traktoren;
    }
    
    public void insertTraktor(Traktor b) {
        traktoren.insert(b);
    }
    
    public void removeTraktor(String id) {
        traktoren.remove(id);
    }
    
    public void changeTraktor() {
        
    }
}