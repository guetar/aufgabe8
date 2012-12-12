
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
        
        DieselTractor t1 = new DieselTractor(1, new Drill(2));
        DieselTractor t2 = new DieselTractor(2, new Drill(4));
        DieselTractor t3 = new DieselTractor(3, new Drill(8));
        DieselTractor t4 = new DieselTractor(4, new Drill(16));
        DieselTractor t5 = new DieselTractor(5, new Drill(32));
        DieselTractor t6 = new DieselTractor(6, new Fertilizer(200));
        DieselTractor t7 = new DieselTractor(7, new Fertilizer(300));
        DieselTractor t8 = new DieselTractor(8, new Fertilizer(450));
        DieselTractor t9 = new DieselTractor(9, new Fertilizer(650));
        GasTractor t10 = new GasTractor(10, new Drill(64));
        GasTractor t11 = new GasTractor(11, new Drill(128));
        GasTractor t12 = new GasTractor(12, new Drill(256));
        GasTractor t13 = new GasTractor(13, new Drill(512));
        GasTractor t14 = new GasTractor(14, new Fertilizer(700));
        GasTractor t15 = new GasTractor(15, new Fertilizer(900));
        GasTractor t16 = new GasTractor(16, new Fertilizer(800));
        GasTractor t17 = new GasTractor(17, new Fertilizer(500));
        GasTractor t18 = new GasTractor(18, new Fertilizer(666));
        
        t1.IncreaseConsumption(1000);
        t2.IncreaseConsumption(500);
        t3.IncreaseConsumption(2000);
        t4.IncreaseConsumption(5000);
        t5.IncreaseConsumption(100);
        t6.IncreaseConsumption(0);
        t7.IncreaseConsumption(10);
        t8.IncreaseConsumption(100);
        t9.IncreaseConsumption(5000);
        t10.IncreaseConsumption(3000);
        t11.IncreaseConsumption(2000);
        t12.IncreaseConsumption(2000);
        t13.IncreaseConsumption(1500);
        t14.IncreaseConsumption(500);
        t15.IncreaseConsumption(180);
        t16.IncreaseConsumption(900);
        t17.IncreaseConsumption(500);
        t18.IncreaseConsumption(666);
        
        t1.increaseHours(50);
        t2.increaseHours(100);
        t3.increaseHours(200);
        t4.increaseHours(300);
        t5.increaseHours(400);
        t6.increaseHours(500);
        t7.increaseHours(600);
        t8.increaseHours(700);
        t9.increaseHours(650);
        t10.increaseHours(100);
        t11.increaseHours(150);
        t12.increaseHours(250);
        t13.increaseHours(350);
        t14.increaseHours(450);
        t15.increaseHours(250);
        t16.increaseHours(250);
        t17.increaseHours(150);
        t18.increaseHours(0);
        
        meidlingerhof.insertTractor(t1);
        meidlingerhof.insertTractor(t2);
        hofbraeuhaus.insertTractor(t3);
        hofbraeuhaus.insertTractor(t4);
        hintergruabn.insertTractor(t5);
        meidlingerhof.insertTractor(t6);
        meidlingerhof.insertTractor(t7);
        hofbraeuhaus.insertTractor(t8);
        hofbraeuhaus.insertTractor(t9);
        meidlingerhof.insertTractor(t10);
        hofbraeuhaus.insertTractor(t11);
        hofbraeuhaus.insertTractor(t12);
        hintergruabn.insertTractor(t13);
        meidlingerhof.insertTractor(t14);
        hofbraeuhaus.insertTractor(t15);
        hofbraeuhaus.insertTractor(t16);
        hofbraeuhaus.insertTractor(t17);
        hintergruabn.insertTractor(t18);
        
        meidlingerhof.getTractor(1).changeTool(new Drill(7));
        meidlingerhof.getTractor(2).changeTool(new Drill(56));
        hofbraeuhaus.getTractor(3).changeTool(new Fertilizer(300));
        hofbraeuhaus.getTractor(4).changeTool(new Fertilizer(500));
        hintergruabn.getTractor(5).changeTool(new Fertilizer(600));
          
        System.out.println("\nAlle Traktoren aus meidlingerhof: ");
        Set tractors = meidlingerhof.getTractors();
        Iterator i = tractors.iterator();
        while(i.hasNext()) {
            Tractor t = (Tractor) i.next();
            System.out.println(t);
        }
        
        System.out.println("\nTraktor Nr. 2, 6 und 10 aus meidlingerhof veraendern:");
        
       meidlingerhof.getTractor(2).IncreaseConsumption(50);    
       meidlingerhof.getTractor(6).IncreaseConsumption(100000);    
       meidlingerhof.getTractor(10).IncreaseConsumption(2.5); 
       meidlingerhof.getTractor(2).changeTool(new Fertilizer(200));
       meidlingerhof.getTractor(6).changeTool(new Drill(39));
       meidlingerhof.getTractor(10).changeTool(new Fertilizer(400));
        i = tractors.iterator();
        while(i.hasNext()) {
            Tractor t = (Tractor) i.next();
            System.out.println(t);
        }        
        
        System.out.println("\nTraktor Nr. 4 aus hofbraeuhaus entfernen:");
        hofbraeuhaus.removeTractor("4");
        
        tractors = hofbraeuhaus.getTractors();
        i = tractors.iterator();
        while(i.hasNext()) {
            Tractor t = (Tractor) i.next();
            System.out.println(t);
        }
        
        System.out.println("\n\nstatistics for farm meidlingerhof: ");
        
        System.out.println("\nConsumption for dieseltractors: ");
        System.out.println(farms.getFarm("Meidlingerhof").ConsumptionForDieselTractors());
        
        System.out.println("\nConsumption for gastractors: ");
        System.out.println(farms.getFarm("Meidlingerhof").ConsumptionForGasTractors());
        
        System.out.println("\nWorking hours for tools: ");
        System.out.println(farms.getFarm("Meidlingerhof").hoursForTools());
        
        System.out.println("\nWorking hours for tractors: ");
        System.out.println(farms.getFarm("Meidlingerhof").hoursForTractors());
        
        System.out.println("\nMinum and Maximum of numbers of drillers: ");
        System.out.println(farms.getFarm("Meidlingerhof").MinMaxDrill());
        
        System.out.println("\nAverage capacity of all fertilizers: ");
        System.out.println(farms.getFarm("Meidlingerhof").averageCapacity());
        

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
        
        for(Class<?> c : classes) {
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