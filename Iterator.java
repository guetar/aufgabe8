
/**
 *
 * @author steff
 */

@Author(name = "Stefan Resch")

public class Iterator implements java.util.Iterator {
    protected Node pos;
    
    public Iterator (Node head) {
        pos = head;
    }

    @Override
    public boolean hasNext() {
        return pos!= null;
    }

    @Override
    public Node next() {
        if (hasNext()) {
            Node tmp = pos;
            pos = pos.getNext();
            return tmp;
        }
        return null;
    }

    @Override
    public void remove() {
        if (pos != null) {
            Node next = pos.getNext();
            Node prev = pos.getPrev();
            if (next != null && prev != null) {
                next.setPrev(prev);
                prev.setNext(next);
                pos = next;
            }
            else if(next != null && prev == null) {
                pos = next;
            }
            else if(next == null) {
                pos = null;
            }
        }
    }
}
