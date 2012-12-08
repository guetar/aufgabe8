
/**
 *
 * @author guetar
 */
public class Test {
    
    public static void main(String[] args) {
        Set farms = new Set();
        
        Farm meidlingerhof = new Farm("Meidlingerhof");
        Farm hofbraeuhaus = new Farm("Hofbraeuhaus");
        Farm hintergruabn = new Farm("Hintergruabn");
        
        farms.insert(meidlingerhof);
        farms.insert(hofbraeuhaus);
        farms.insert(hintergruabn);
        
        meidlingerhof.insertTractor(new DieselTractor(1));
        meidlingerhof.insertTractor(new GasTractor(2));
        meidlingerhof.insertTractor(new DieselTractor(3));
        
        Set tractors = meidlingerhof.getTractors();
        Iterator i = tractors.iterator();
        while(i.hasNext()) {
            Tractor t = (Tractor) i.next();
            System.out.println(t.getNr());
        }
        
        meidlingerhof.removeTractor("traktor_3");
        
        tractors = meidlingerhof.getTractors();
        i = tractors.iterator();
        while(i.hasNext()) {
            Tractor t = (Tractor) i.next();
            System.out.println(t.getNr());
        }
    }
}