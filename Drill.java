
/**
 *
 * @author guetar
 */

@Author(name = "Guenther Bernsteiner")
public class Drill extends Tool {

    private int capacity;
    
    public Drill(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    @Author(name = "Guenther Bernsteiner")
    public void use() {
        drill();
    }
    
    @Author(name = "Guenther Bernsteiner")
    private void drill() {}
    
    @Override
    @Author(name = "Guenther Bernsteiner")
    public Integer getCapacity() {
        return capacity;
    }
}