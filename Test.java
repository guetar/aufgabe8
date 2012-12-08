
import java.lang.reflect.Method;


/**
 *
 * @author guetar
 */

@Author(name = "Günther Bernsteiner")

public class Test {
    
    public static void main(String[] args) {
        Set bauernhoefe = new Set();
        
        Farm meidlingerhof = new Farm("Meidlingerhof");
        Farm hofbraeuhaus = new Farm("Hofbraeuhaus");
        Farm hintergruabn = new Farm("Hintergruabn");
        
        bauernhoefe.insert(meidlingerhof);
        bauernhoefe.insert(hofbraeuhaus);
        bauernhoefe.insert(hintergruabn);
        
        meidlingerhof.insertTractor(new Tractor(1));
        meidlingerhof.insertTractor(new Tractor(2));
        meidlingerhof.insertTractor(new Tractor(3));
        
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
        
        Method[] methods = Farm.class.getMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(Author.class)) {
                Author a = m.getAnnotation(Author.class);
                System.out.println("Methode: " + m.getName());
            }
        }
    }
}