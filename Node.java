
/**
 *
 * @author guetar
 */
public abstract class Node {

    private Node next;
    private Node prev;

    public Node() {
        next = null;
        prev = null;
    }

    public void insert(Node n) {
        if (next != null) {
            next.insert(n);
        } else {
            next = n;
            next.setPrev(this);
        }
    }
  
    public boolean hasNext() {
        return (next != null);
    }
        
    public void setNext(Node nextN) {
        next = nextN;
    }
    
    public Node getNext() {
        return next;
    }

    public void setPrev(Node prevN) {
        prev = prevN;
    }

    public Node getPrev() {
        return prev;
    }
}
