
/**
 *
 * @author mattV
 */

@Author(name = "Matthias Vigele")

public class Drill extends Tool {

    private int capacity;
    
    public Drill(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public void use() {
        drill();
    }
    
    private void drill() {}
    
    @Override
    public Integer getCapacity() {
        return capacity;
    }
}