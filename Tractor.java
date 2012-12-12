
/**
 *
 * @author guetar
 */

@Author(name = "Stefan Resch")
public abstract class Tractor extends Node {
    
    private final int nr;
    private Tool tool;
    private int hoursInUse;
    
    public Tractor(int nr, Tool tool) {
        super("" + nr);
        this.nr = nr;
        this.hoursInUse = 0;
        this.tool = tool;
    }
    
    @Author(name = "Stefan Resch")
    public int getNr() {
        return nr;
    }
    
    @Author(name = "Stefan Resch")
    public void changeTool(Tool t) {
        tool = t;
    }
    
    @Author(name = "Stefan Resch")
    public Tool getTool() {
        return tool;
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
