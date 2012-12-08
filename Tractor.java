
/**
 *
 * @author guetar
 */

@Author(name = "Günther Bernsteiner")

public abstract class Tractor extends Node {
    
    private final int nr;
    private Tool tool;
    private int hoursInUse;
    
    public Tractor(int nr) {
        super("" + nr);
        this.nr = nr;
        this.hoursInUse = 0;
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
    
    @Author(name = "Stefan Resch")
    public void increaseHours(int hours) {
        hoursInUse += hours;
    }
    
    @Author(name = "Stefan Resch")
    public int getHours() {
        return hoursInUse;
    }
    
    public abstract Number getConsumption();
    public abstract void IncreaseConsumption(Number amount);
}
