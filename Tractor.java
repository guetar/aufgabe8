
/**
 *
 * @author guetar
 */
public abstract class Tractor extends Node {
    
    private final int nr;
    private int hours;
    
    public Tractor(int nr) {
        super("tractor_" + nr);
        this.nr = nr;
        this.hours = 0;
    }
    
    public int getNr() {
        return nr;
    }
    
    public void raiseHours() {
        hours++;
    }
    
    public int getHours() {
        return hours;
    }
    
    public abstract int getAmount();
    public abstract int raiseAmount();
    public abstract void changeTool(Tool t);
}