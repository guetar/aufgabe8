
/**
 *
 * @author guetar
 */
public class Set implements Iterable {

    private Node head;

    @Override
    public Iterator iterator() {
        return new Iterator(head);
    }

    public void insert(Node n) {
        if (head == null) {
            head = n;
        } else {
            head.insert(n);
        }
    }
    
    public void remove(Node n) {
        if (head == null) {
            return;
        }
        head.remove(n);
    }
}
