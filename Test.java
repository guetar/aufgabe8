
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guetar
 */

@Author(name = "Guenther Bernsteiner")
public class Test {
    
    public static void main(String[] args) {
        
        /**
         * Erstellen Sie eine Menge von Bauernhoefen mit jeweils einigen Traktoren
         * wirklich eine Menge von Bauernhoefen (eine Form von Collection), 
         * nicht nur eine Ansammlung einzelner Variablen. Jeder Bauernhof in 
         * der Menge soll ueber seinen eindeutigen Namen angesprochen werden, 
         * und jeder Traktor eines Bauernhofes ueber seine eindeutige Nummer. 
         **/
        
        Set farms = new Set();
        
        Farm meidlingerhof = new Farm("Meidlingerhof");
        Farm hofbraeuhaus = new Farm("Hofbraeuhaus");
        Farm hintergruabn = new Farm("Hintergruabn");
        
        farms.insert(meidlingerhof);
        farms.insert(hofbraeuhaus);
        farms.insert(hintergruabn);   
        
        /**
         * Fuegen Sie zu einigen Bauernhoefen einzelne Traktoren hinzu, entfernen 
         * Sie einzelne Traktoren, und aendern Sie die Informationen zu einzelnen 
         * Traktoren, wobei Sie Traktoren und Bauernhoefe nur ueber deren Nummern 
         * und Namen ansprechen.
         */
        
        ((Farm) farms.getNode("Meidlingerhof")).insertTractor(new DieselTractor(1));
        ((Farm) farms.getNode("Meidlingerhof")).insertTractor(new GasTractor(2));
        ((Farm) farms.getNode("Meidlingerhof")).insertTractor(new DieselTractor(3));
        
        ((Farm) farms.getNode("Meidlingerhof")).getTractor(1).changeTool(new Drill(3));
        ((Farm) farms.getNode("Meidlingerhof")).getTractor(2).changeTool(new Drill(56));
        ((Farm) farms.getNode("Meidlingerhof")).getTractor(3).changeTool(new Fertilizer(32));
          
        Set tractors = meidlingerhof.getTractors();
        Iterator i = tractors.iterator();
        while(i.hasNext()) {
            Tractor t = (Tractor) i.next();
            System.out.println("Traktor Nr. "+t.getNr()+", Consumtion: "+t.getConsumption()+", Tool Capacity: "+t.getToolCapacity());
        }
        
        System.out.println("Traktor Nr. 2 und 3 veraendern:");
        
       ((Farm) farms.getNode("Meidlingerhof")).getTractor(2).IncreaseConsumption(5.3);    
       ((Farm) farms.getNode("Meidlingerhof")).getTractor(3).IncreaseConsumption(2.5); 
        i = tractors.iterator();
        while(i.hasNext()) {
            Tractor t = (Tractor) i.next();
            System.out.println("Traktor Nr. "+t.getNr()+", Consumtion: "+t.getConsumption()+", Tool Capacity: "+t.getToolCapacity());
        }        
        
        System.out.println("Traktor Nr. 3 entfernen:");
        meidlingerhof.removeTractor("3");
        
        tractors = meidlingerhof.getTractors();
        i = tractors.iterator();
        while(i.hasNext()) {
            Tractor t = (Tractor) i.next();
            System.out.println("Traktor Nr. "+t.getNr()+", Consumtion: "+t.getConsumption()+", Tool Capacity: "+t.getToolCapacity());
        }
        
//        System.out.println("Consumption for dieseltractors: ");
//        System.out.println(((Farm) farms.getNode("Meidlingerhof")).ConsumptionForDieselTractors());
//        
//        System.out.println("Consumption for gastractors: ");
//        System.out.println(((Farm) farms.getNode("Meidlingerhof")).ConsumptionForGasTractors());
//        
//        System.out.println("Working hours for tools: ");
//        System.out.println(((Farm) farms.getNode("Meidlingerhof")).hoursForTools());
//        
//        System.out.println("Working hours for tractors: ");
//        System.out.println(((Farm) farms.getNode("Meidlingerhof")).hoursForTractors());
        

        /**
         * Listet alle Klassen, deren Verfasser, sowie die darin enthaltenen Methoden inklusive deren Verfassern
         */
        
        List<Class> classes = new ArrayList<Class>();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL url = classLoader.getResource(".");
        
        try {
            File root = new File(url.toURI());

            File[] files = root.listFiles();
            for (File file : files) {
                if (!file.isDirectory() && !file.getName().equals("<error>.class") && file.getName().endsWith(".class")) {
                    classes.add(Class.forName(file.getName().substring(0, file.getName().length() - 6)));
                }
            }
        } catch (URISyntaxException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        for(Class c : classes) {
            if(c.isAnnotationPresent(Author.class)) {
                System.out.println("---------------------------------------------------");
                Annotation[] anths = c.getAnnotations();
                for(Annotation anth : anths) {
                    Author a = (Author) anth;
                    System.out.println("Class " + c.getName() + " created by " + a.name());
                }
                System.out.println("---------------------------------------------------");
                Method[] methods = c.getMethods();
                for (Method m : methods) {
                    if (m.isAnnotationPresent(Author.class)) {
                        Author a = m.getAnnotation(Author.class);
                        System.out.println("Method " + m.getName() + " created by " + a.name());
                    }
                }
            }
        }
    }
}