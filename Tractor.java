
/**
 *
 * @author guetar
 */
public abstract class Tractor extends Node {
    
    private final int nr;
    
    public Tractor(int nr) {
        super("tractor_" + nr);
        this.nr = nr;
    }
    
    public int getNr() {
        return nr;
    }
    
    public abstract int getAmount();
    public abstract int raiseAmount();
    public abstract void changeTool(Tool t);
}