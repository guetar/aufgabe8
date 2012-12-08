
import java.lang.reflect.Method;


/**
 *
 * @author guetar
 */

@Author(name = "Günther Bernsteiner")

public class Test {
    
    public static void main(String[] args) {
        
        /**
         * Erstellen Sie eine Menge von Bauernhoefen mit jeweils einigen Traktoren
         * – wirklich eine Menge von Bauernhoefen (eine Form von Collection), 
         * nicht nur eine Ansammlung einzelner Variablen. Jeder Bauernhof in 
         * der Menge soll ueber seinen eindeutigen Namen angesprochen werden, 
         * und jeder Traktor eines Bauernhofes ueber seine eindeutige Nummer. 
         * */
        Set bauernhoefe = new Set();
        
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
        
        Method[] methods = Farm.class.getMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(Author.class)) {
                Author a = m.getAnnotation(Author.class);
                System.out.println("Methode: " + m.getName());
            }
        }
    }
}
