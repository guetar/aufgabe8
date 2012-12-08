
/**
 *
 * @author guetar
 */

@Author(name = "Günther Bernsteiner")

public class Drill extends Tool {

    private int capacity;
    
    public Drill(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    @Author(name = "Günther Bernsteiner")
    public void use() {
        drill();
    }
    
    @Author(name = "Günther Bernsteiner")
    private void drill() {}
    
    @Override
    @Author(name = "Günther Bernsteiner")
    public Integer getCapacity() {
        return capacity;
    }
}