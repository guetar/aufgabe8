
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

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
         **/
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
    
    /**
     * Scans all classes accessible from the context class loader which belong
     * to the given package and subpackages.
     *
     * @param packageName The base package
     * @return The classes
     * @throws ClassNotFoundException
     * @throws IOException
     */
    private static Class[] getClasses(String packageName)
            throws ClassNotFoundException, IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        assert classLoader != null;
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> dirs = new ArrayList<File>();
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        ArrayList<Class> classes = new ArrayList<Class>();
        for (File directory : dirs) {
            classes.addAll(findClasses(directory, packageName));
        }
        return classes.toArray(new Class[classes.size()]);
    }

    /**
     * Recursive method used to find all classes in a given directory and
     * subdirs.
     *
     * @param directory The base directory
     * @param packageName The package name for classes found inside the base
     * directory
     * @return The classes
     * @throws ClassNotFoundException
     */
    private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class> classes = new ArrayList<Class>();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }


}
