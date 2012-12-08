
/**
 *
 * @author guetar
 */
public abstract class Traktor extends Node {
    
    private final int nr;
    
    public Traktor(int nr) {
        super("traktor_" + nr);
        this.nr = nr;
    }
    
    public int getNr() {
        return nr;
    }
    
    public abstract int getAmount();
    public abstract int raiseAmount();
}