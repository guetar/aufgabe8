
/**
 *
 * @author steff
 */

@Author(name = "Stefan Resch")

public abstract class Node {

    private final String id;
    private Node next;
    private Node prev;

    public Node(String id) {
        this.id = id;
        this.next = null;
        this.prev = null;
    }

    public void insert(Node n) {
        if (next != null) {
            next.insert(n);
        } else {
            next = n;
            next.setPrev(this);
        }
    }
    
    public String getId() {
        return id;
    }
    
    public void remove(String id) {
        if(!this.getId().equals(id)) {
            if(next != null) next.remove(id);
        } else {
            if (next != null && prev != null) {
                next.setPrev(prev);
                prev.setNext(next);
            }
            else if(next != null && prev == null) {
                next.setPrev(null);
            }
            else if(next == null) {
                prev.setNext(null);
            }
        }
    }
    
    //rekursive Suche nach Knoten mit der angegebenen id
    //NB: returns den gesuchten Knoten oder null,wenn kein Knoten mit der 
    //angegebenen id existiert
    public Node find(Node n, String id) {
        if (!n.getId().equals(id)) {
            if (n.next != null) {
                return find(n.next, id);
            } else {
                return null;
            }
        } else {
            return n;
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
