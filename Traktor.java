
/**
 *
 * @author guetar
 */
public class Traktor extends Node {
    
    private final int nr;
    
    public Traktor(int nr) {
        super("traktor_" + nr);
        this.nr = nr;
    }
    
    public int getNr() {
        return nr;
    }
}