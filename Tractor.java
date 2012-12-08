
/**
 *
 * @author guetar
 */
public abstract class Tractor extends Node {
    
    private final int nr;
    private Tool tool;
    
    public Tractor(int nr) {
        super("tractor_" + nr);
        this.nr = nr;
    }
    
    public int getNr() {
        return nr;
    }
    
    public void changeTool(Tool t) {
        tool = t;
    }
    
    public Number getToolCapacity() {
        return tool.getCapacity();
    }
    
    public abstract Number getConsumption();
    public abstract void raiseConsumption(Number amount);
}