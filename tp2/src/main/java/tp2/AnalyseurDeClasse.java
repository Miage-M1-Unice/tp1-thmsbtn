package tp2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class AnalyseurDeClasse
{
   public static void main( String[] args ){
       try {
            Class classe = Class.forName("java.lang.String");
            
            System.out.println("Classe de l'objet chaine : "+classe.getName());
            System.out.println("Classe mère : " + classe.getSuperclass());
            
            System.out.println("\nLes modifiers de la classe  :");
            int a = classe.getModifiers();
            System.out.println(Modifier.toString(a));
            
            Class[] interfaces = classe.getInterfaces();
            if(interfaces.length > 0) {
                System.out.println("\nLa/Les interface(s) de la classe sont/est : ");
                for (int i = 0; i < interfaces.length; i++) {
                    System.out.println(interfaces[i].getName());
                }
            }
            
            System.out.println("\nListe des constructeurs de la classe : ");
            @SuppressWarnings("rawtypes")
            Constructor[] cons = classe.getConstructors();
            for(@SuppressWarnings("rawtypes") Constructor c : cons) {
                System.out.println(c);
            }
            
            System.out.println("\nListe des méthodes de la classe : ");
            Method[] meth = classe.getMethods();
            for(Method m : meth) {
                System.out.println(m);
            }
            
            System.out.println("\nListe des fields de la classe : ");
            Field[] fields = classe.getFields();
            for(Field f : fields) {
                System.out.println(f);
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
           
   }
}