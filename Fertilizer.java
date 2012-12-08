
/**
 *
 * @author guetar
 */

@Author(name = "Günther Bernsteiner")

public class Fertilizer extends Tool {
    
    private double capacity;
    
    public Fertilizer(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    @Author(name = "Günther Bernsteiner")
    public void use() {
        seed();
    }
    
    @Author(name = "Günther Bernsteiner")
    private void seed() {}
    
    @Override
    @Author(name = "Günther Bernsteiner")
    public Double getCapacity() {
        return capacity;
    }
}