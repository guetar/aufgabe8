/**
 *
 * @author guetar
 */
public class Fertilizer extends Tool {
    
    private int capacity;
    
    public Fertilizer(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public void use() {
        seed();
    }
    
    private void seed() {}
    
    @Override
    public int getCapacity() {
        return capacity;
    }
}