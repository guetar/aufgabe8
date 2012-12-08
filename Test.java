
/**
 *
 * @author guetar
 */
public class Test {
    
    public static void main(String[] args) {
        Set traktoren = new Set();
        traktoren.insert(new Traktor(1));
        traktoren.insert(new Traktor(2));
        
        Iterator i = traktoren.iterator();
        while(i.hasNext()) {
            Traktor t = (Traktor) i.next();
            System.out.println(t.getNr());
        }
    }
}