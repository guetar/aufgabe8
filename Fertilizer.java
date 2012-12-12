
/**
 *
 * @author guetar
 */

@Author(name = "Guenther Bernsteiner")
public class Fertilizer extends Tool {
    
    private double capacity;
    
    public Fertilizer(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    @Author(name = "Guenther Bernsteiner")
    public void use() {
        seed();
    }
    
    @Author(name = "Guenther Bernsteiner")
    private void seed() {}
    
    @Override
    @Author(name = "Guenther Bernsteiner")
    public Double getCapacity() {
        return capacity;
    }
    
    @Override
    @Author(name = "Guenther Bernsteiner")
    public String toString() {
        return "fertilizer";
    }
}