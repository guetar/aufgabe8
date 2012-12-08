/**
 *
 * @author steff
 */
public class Statistic {
    /**
     * Diese Klasse erstellt ein "Statistikobjekt", dem beim durchiterieren eines
     * Tractor-Sets die einzelnen Tractors uebergeben werden und diese gleich 
     * in einer Gesamtstatistik erfasst, um diese in einem einheitlichen
     * Statistikobjekt und mit toString einfacher ausgeben zu koennen.
     */
    private Iterator it;
    
    public Statistic(Iterator it) {
        this.it = it;
    }
    
    
    public String hoursForTools() {
        String result = "";
        
        int drillHours = 0; //drill
        int drillCount = 0;
        int fertHours = 0; //fertilizer
        int fertCount = 0;
        
        while(it.hasNext()) {
            Node n = it.next();
            
            if (n instanceof Tractor) {
                Tractor t = (Tractor) n;
                
                if (t.getTool() instanceof Drill) {
                    drillHours += t.getHours();
                    drillCount++;
                } else if (t.getTool() instanceof Fertilizer) {
                    fertHours += t.getHours();
                    fertCount++;
                }
            }
        }
        
        int drillAvg = drillHours / drillCount;
        int fertAvg = fertHours / fertCount;
        int totalAvg = (drillHours + fertHours) / (drillCount + fertCount);
        
        result += "Average Hours of all tractors: " + totalAvg + "\n";
        result += "Average Hours of all tractors with drilling machines: " + drillAvg + "\n";
        result += "Average Hours of all tractors with fertilizers: " + fertAvg + "\n";
        return result;
    }
    
    
    public String hoursForTractors() {
        String result = "";
        
        int dieselHours = 0;
        int dieselCount = 0;
        int gasHours = 0;
        int gasCount = 0;
        
        while(it.hasNext()) {
            Node n = it.next();
            
            if (n instanceof Tractor) {
                Tractor t = (Tractor) n;
                if (t instanceof DieselTractor) {
                    dieselHours += t.getHours();
                    dieselCount++;
                } else if (t instanceof GasTractor) {
                    gasHours += t.getHours();
                    gasCount++;
                }
            }
        }
        
        int dieselAvg = dieselHours / dieselCount;
        int gasAvg = gasHours / gasCount;
        int totalAvg = (dieselHours + gasHours) / (dieselCount + gasCount);
        
        result += "Average Hours of all tractors: " + totalAvg + "\n";
        result += "Average Hours of all Dieseltractors: " + dieselAvg + "\n";
        result += "Average Hours of all Gastractors: " + gasAvg + "\n";
        return result;
    }
    
    public String ConsumptionForDieselTractors() {
        String result = "";
        
        int drillConsumption = 0;
        int drillCount = 0;
        int fertConsumption = 0;
        int fertCount = 0;
        
        while(it.hasNext()) {
            Node n = it.next();
            
            if (n instanceof DieselTractor) {
                DieselTractor t = (DieselTractor) n;
                if (t.getTool() instanceof Drill) {
                    drillConsumption += t.getConsumption();
                    drillCount++;
                } else if (t.getTool() instanceof Fertilizer) {
                    fertConsumption += t.getConsumption();
                    fertCount++;
                }
            }
        }
        
        int drillAvg = drillConsumption / drillCount;
        int fertAvg = fertConsumption / fertCount;
        int totalAvg = (drillConsumption + fertConsumption) / (drillCount + fertCount);
        
        result += "Average Consumption of all Dieseltractors: " + totalAvg + "\n";
        result += "Average Consumption of all Dieseltractors: with drilling machines" + drillAvg + "\n";
        result += "Average Consumption of all Dieseltractors with fertilizers: " + fertAvg + "\n";
        return result;
    }
    
    public String ConsumptionForGasTractors() {
        String result = "";
        
        double drillConsumption = 0;
        double drillCount = 0;
        double fertConsumption = 0;
        double fertCount = 0;
        
        while(it.hasNext()) {
            Node n = it.next();
            
            if (n instanceof GasTractor) {
                GasTractor t = (GasTractor) n;
                if (t.getTool() instanceof Drill) {
                    drillConsumption += t.getConsumption();
                    drillCount++;
                } else if (t.getTool() instanceof Fertilizer) {
                    fertConsumption += t.getConsumption();
                    fertCount++;
                }
            }
        }
        
        double drillAvg = drillConsumption / drillCount;
        double fertAvg = fertConsumption / fertCount;
        double totalAvg = (drillConsumption + fertConsumption) / (drillCount + fertCount);
        
        result += "Average Consumption of all Dieseltractors: " + totalAvg + "\n";
        result += "Average Consumption of all Dieseltractors: with drilling machines" + drillAvg + "\n";
        result += "Average Consumption of all Dieseltractors with fertilizers: " + fertAvg + "\n";
        
        return result;
    }
    
    /**
     * Die minimale und maximale Anzahl an Säscharen insgesamt und aufgeschlüsselt 
     * nach Art des Traktors (Dieseltraktor oder Biogastraktor). 
     */
    public String getMinMaxDrill() {
        String result = "";
        
        int min = Integer.MAX_VALUE;
        int max;
        
        while(it.hasNext()) {
            Node n = it.next();
            
            if (n instanceof Tractor) {
                Tractor tractor = (Tractor) n;
                Tool tool = tractor.getTool();
                
                if(tool instanceof Drill) {
                    //int cap = tool.getCapacity();
                }
            }
        }
        
        return result;
    }
}
