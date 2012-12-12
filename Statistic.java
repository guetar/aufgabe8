
/**
 *
 * @author steff
 */

@Author(name = "Stefan Resch")
public class Statistic {
    /**
     * Diese Klasse erstellt ein "Statistikobjekt", dem beim durchiterieren eines
     * Tractor-Sets die einzelnen Tractors uebergeben werden und diese gleich 
     * in einer Gesamtstatistik erfasst, um diese in einem einheitlichen
     * Statistikobjekt und mit toString einfacher ausgeben zu koennen.
     */
    
    @Author(name = "Stefan Resch")
    public String hoursForTools(Iterator it) {
        String result = "";
        
        int drillHours = 0; //drill
        int drillCount = 0;
        int fertHours = 0; //fertilizer
        int fertCount = 0;
        
        while(it.hasNext()) {
            Tractor t = (Tractor) it.next();

            if (t.getTool() instanceof Drill) {
                drillHours += t.getHours();
                drillCount++;
            } else if (t.getTool() instanceof Fertilizer) {
                fertHours += t.getHours();
                fertCount++;
            }
        }
        
        int drillAvg = (drillCount != 0)? drillHours / drillCount : 0;
        int fertAvg = (fertCount != 0)? fertHours / fertCount : 0;
        int totalAvg = (drillCount + fertCount != 0)? (drillHours + fertHours) / (drillCount + fertCount) : 0;
        
        result += "Average Hours of all tractors: " + totalAvg + "\n";
        result += "Average Hours of all tractors with drilling machines: " + drillAvg + "\n";
        result += "Average Hours of all tractors with fertilizers: " + fertAvg + "\n";
        return result;
    }
    
    @Author(name = "Stefan Resch")
    public String hoursForTractors(Iterator it) {
        String result = "";
        
        int dieselHours = 0;
        int dieselCount = 0;
        int gasHours = 0;
        int gasCount = 0;
        
        while(it.hasNext()) {
            Tractor t = (Tractor) it.next();
            
            if (t instanceof DieselTractor) {
                dieselHours += t.getHours();
                dieselCount++;
            } else if (t instanceof GasTractor) {
                gasHours += t.getHours();
                gasCount++;
            }
        }
        
        int dieselAvg = (dieselCount != 0)? dieselHours / dieselCount : 0;
        int gasAvg = (gasCount != 0)? gasHours / gasCount : 0;
        int totalAvg = (dieselCount + gasCount != 0)? (dieselHours + gasHours) / (dieselCount + gasCount) : 0;
        
        result += "Average Hours of all tractors: " + totalAvg + "\n";
        result += "Average Hours of all diesel tractors: " + dieselAvg + "\n";
        result += "Average Hours of all gas tractors: " + gasAvg + "\n";
        return result;
    }
    
    @Author(name = "Stefan Resch")
    public String ConsumptionForDieselTractors(Iterator it) {
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
        
        int drillAvg = (drillCount != 0) ? drillConsumption / drillCount : 0;
        int fertAvg = (fertCount != 0) ? fertConsumption / fertCount : 0;
        int totalAvg = (drillCount + fertCount != 0) ? (drillConsumption + fertConsumption) / (drillCount + fertCount) : 0;
        
        result += "Average Consumption of all dieseltractors: " + totalAvg + "\n";
        result += "Average Consumption of all diesel tractors with drilling machines: " + drillAvg + "\n";
        result += "Average Consumption of all diesel tractors with fertilizers: " + fertAvg + "\n";
        return result;
    }
    
    @Author(name = "Stefan Resch")
    public String ConsumptionForGasTractors(Iterator it) {
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
        
        double drillAvg = (drillCount != 0)? drillConsumption / drillCount : 0;
        double fertAvg = (fertCount != 0)? fertConsumption / fertCount : 0;
        double totalAvg = (drillCount + fertCount != 0)? (drillConsumption + fertConsumption) / (drillCount + fertCount) : 0;
        
        result += "Average Consumption of all dieseltractors: " + totalAvg + "\n";
        result += "Average Consumption of all diesel tractors with drilling machines: " + drillAvg + "\n";
        result += "Average Consumption of all diesel tractors with fertilizers: " + fertAvg + "\n";
        
        return result;
    }

    @Author(name = "Stefan Resch")
    public String getMinMaxDrill(Iterator it) {
        String result = "";
        
        int min = Integer.MAX_VALUE;
        Tractor tractorMin = null;
        int max = 0;
        Tractor tractorMax = null;
        
        while(it.hasNext()) {
            Tractor tractor = (Tractor) it.next();
            Tool tool = tractor.getTool();

            if(tool instanceof Drill) {
                Drill drill = (Drill) tool;
                int cap = drill.getCapacity();
                if (cap < min) {
                    min = cap;
                    tractorMin = tractor;
                }
                if (cap > max) {
                    max = cap;
                    tractorMax = tractor;
                }
            }
        }
        
        result += tractorMin + " with the least drills: " + min + "\n";
        result += tractorMax + " with the most drills: " + max + "\n";
        return result;
    }
    
    /**
     * Die durchschnittliche Fassungskapazität des Düngerbehälters aller Traktoren 
     * insgesamt und aufgeschlüsselt nach Art des Traktors (Dieseltraktor oder Biogastraktor).
     */
    @Author(name = "Stefan Resch")
    public String getAverageCapacity(Iterator it) {
        String result = "";
        
        double dieselCap = 0;
        int dieselCount = 0;
        double gasCap = 0;
        int gasCount = 0;
        
        while(it.hasNext()) {
            Tractor tractor = (Tractor) it.next();
            Tool tool = tractor.getTool();
            if (tool instanceof Fertilizer) {
                Fertilizer fert = (Fertilizer) tool;
                if (tractor instanceof DieselTractor) {
                    dieselCap += fert.getCapacity();
                    dieselCount++;
                } else if (tractor instanceof GasTractor) {
                    gasCap += fert.getCapacity();
                    gasCount++;
                }
            }
        }
        
        double avgDieselCap = (dieselCount != 0)? dieselCap / dieselCount : 0;
        double avgGasCap = (gasCount != 0)? gasCap / gasCount : 0;
        double avgTotalCap = (dieselCount + gasCount != 0)? (dieselCap + gasCap) / (dieselCount + gasCount) : 0;
        
        result += "Average capacities of all tractors: " + avgTotalCap + "\n";
        result += "Average capacities of all dieseltractors: " + avgDieselCap + "\n";
        result += "Average capacities of all gastractors: " + avgGasCap + "\n";
        return result;
    }
}
