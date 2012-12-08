
/**
 *
 * @author guetar
 */
public abstract class Tractor extends Node {
    
    private final int nr;
    private Tool tool;
    private int hoursInUse;
    
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
    
    public Tool getTool() {
        return tool;
    }
    
    public Number getToolCapacity() {
        return tool.getCapacity();
    }
    
    public void increaseHours(int hours) {
        hoursInUse += hours;
    }
    
    public int getHours() {
        return hoursInUse;
    }
    
    public abstract Number getConsumption();
    public abstract void IncreaseConsumption(Number amount);
}