
/**
 *
 * @author guetar
 */
public class Test {
    
    public static void main(String[] args) {
        Set bauernhoefe = new Set();
        
        Bauernhof meidlingerhof = new Bauernhof("Meidlingerhof");
        Bauernhof hofbraeuhaus = new Bauernhof("Hofbraeuhaus");
        Bauernhof hintergruabn = new Bauernhof("Hintergruabn");
        
        bauernhoefe.insert(meidlingerhof);
        bauernhoefe.insert(hofbraeuhaus);
        bauernhoefe.insert(hintergruabn);
        
        meidlingerhof.insertTraktor(new Traktor(1));
        meidlingerhof.insertTraktor(new Traktor(2));
        meidlingerhof.insertTraktor(new Traktor(3));
        
        Set traktoren = meidlingerhof.getTraktoren();
        Iterator i = traktoren.iterator();
        while(i.hasNext()) {
            Traktor t = (Traktor) i.next();
            System.out.println(t.getNr());
        }
        
        meidlingerhof.removeTraktor("traktor_3");
        
        traktoren = meidlingerhof.getTraktoren();
        i = traktoren.iterator();
        while(i.hasNext()) {
            Traktor t = (Traktor) i.next();
            System.out.println(t.getNr());
        }
    }
}