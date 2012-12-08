
/**
 *
 * @author mattV
 */

@Author(name = "Matthias Vigele")

public class Fertilizer extends Tool {
    
    private double capacity;
    
    public Fertilizer(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public void use() {
        seed();
    }
    
    private void seed() {}
    
    @Override
    public Double getCapacity() {
        return capacity;
    }
}