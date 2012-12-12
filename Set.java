
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

    //NB: fuegt nur ein, wenn noch kein Knoten mit der selben ID vorhanden ist.
    @Author(name = "Stefan Resch")
    public void insert(Node n) {
        if (head == null) {
            head = n;
        } else {
            Node help = getNode(n.getId());
            if (help == null) {
                head.insert(n);
            }
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
    
    @Author(name= "Stefan Resch")
    public Farm getFarm(String id) {
        Node n = head.find(head, id);
        if (n instanceof Farm) {
            return (Farm) n;
        } 
        return null;
    }
    
    @Author(name= "Stefan Resch")
    public Tractor getTractor(String id) {
        Node n = head.find(head, id);
        if (n instanceof Tractor) {
            return (Tractor) n;
        } 
        return null;
    }
}
