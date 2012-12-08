
/**
 *
 * @author guetar
 */
public class Test {
    
    public static void main(String[] args) {
        Set traktoren = new Set();
        Traktor traktor2 = new Traktor(2);
        traktoren.insert(new Traktor(1));
        traktoren.insert(new Traktor(3));
        traktoren.insert(traktor2);
        
        Iterator i = traktoren.iterator();
        while(i.hasNext()) {
            Traktor t = (Traktor) i.next();
            System.out.println(t.getNr());
        }
        
        traktoren.remove(traktor2);
        
        i = traktoren.iterator();
        while(i.hasNext()) {
            Traktor t = (Traktor) i.next();
            System.out.println(t.getNr());
        }
    }
}