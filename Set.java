
/**
 *
 * @author steff
 */

@Author(name = "Stefan Resch")

public class Set implements Iterable {

    private Node head;

    @Override
    @Author(name = "Stefan Resch")
    public Iterator iterator() {
        return new Iterator(head);
    }

    @Author(name = "Stefan Resch")
    public void insert(Node n) {
        if (head == null) {
            head = n;
        } else {
            head.insert(n);
        }
    }
    
    @Author(name = "Stefan Resch")
    public void remove(String id) {
        if (head == null) {
            return;
        }
        head.remove(id);
    }
    
    //rekursive Suche nach Knoten mit der angegebenen id
    //NB: returns den gesuchten Knoten oder null,wenn kein Knoten mit der 
    //angegebenen id existiert
    @Author(name = "Matthias Vigele")
    public Node getNode(String id){
        return head.find(head, id);
    }
}
