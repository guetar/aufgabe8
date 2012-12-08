
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
        
        bauernhoefe.insert(meidlingerhof);
        bauernhoefe.insert(hofbraeuhaus);
        bauernhoefe.insert(hintergruabn);   
        
        /**
         * Fuegen Sie zu einigen Bauernhöfen einzelne Traktoren hinzu, entfernen 
         * Sie einzelne Traktoren, und aendern Sie die Informationen zu einzelnen 
         * Traktoren, wobei Sie Traktoren und Bauernhoefe nur über deren Nummern 
         * und Namen ansprechen.
         */
        
        ((Farm) bauernhoefe.getNode("Meidlingerhof")).insertTractor(new DieselTractor(1));
        ((Farm) bauernhoefe.getNode("Meidlingerhof")).insertTractor(new GasTractor(2));
        ((Farm) bauernhoefe.getNode("Meidlingerhof")).insertTractor(new DieselTractor(3));
          
        Set tractors = meidlingerhof.getTractors();
        Iterator i = tractors.iterator();
        while(i.hasNext()) {
            Tractor t = (Tractor) i.next();
            System.out.println("Traktor Nr. "+t.getNr()+", Consumtion: "+t.getConsumption());
        }
        
        System.out.println("Traktor Nr. 2 und 3 veraendern:");
        
       ((Farm) bauernhoefe.getNode("Meidlingerhof")).getTractor(2).IncreaseConsumption(5.3);    
       ((Farm) bauernhoefe.getNode("Meidlingerhof")).getTractor(3).IncreaseConsumption(2.5); 
        i = tractors.iterator();
        while(i.hasNext()) {
            Tractor t = (Tractor) i.next();
            System.out.println("Traktor Nr. "+t.getNr()+", Consumtion: "+t.getConsumption());
        }        
        
        System.out.println("Traktor Nr. 3 entfernen:");
        meidlingerhof.removeTractor("3");
        
        tractors = meidlingerhof.getTractors();
        i = tractors.iterator();
        while(i.hasNext()) {
            Tractor t = (Tractor) i.next();
            System.out.println("Traktor Nr. "+t.getNr()+", Consumtion: "+t.getConsumption());
        }
        
        /**
         * Berechnen Sie die statistischen Werte aller Bauernhoefe (wie oben beschrieben). 
         */    
        
        /**
         * Geben Sie die Namen der von Ihnen geschriebenen Klassen und Methoden 
         * zusammen mit den Personen, die dafuer hauptsaechlich verantwortlich 
         * sind, aus. Dabei sollen die Methodennamen sowie die verantwortlichen 
         * Personen ausschließlich ueber Reflection aus den Klassen mithilfe der 
         * Annotationen ermittelt werden. 
         */

    }
}
