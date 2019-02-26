package tp2;

import java.lang.reflect.Field;

public class GenericToString {
   public String toString(Object o) {
       String str = o.getClass().getName() + "[";

       @SuppressWarnings("rawtypes")
       Class classe = null;

       try {
           classe = Class.forName(o.getClass().getName());
       }
       catch (ClassNotFoundException e) {
           e.printStackTrace();
       }

       Field[] fields = classe.getDeclaredFields();

       for(int i=0; i<fields.length; i++) {
           fields[i].setAccessible(true);

           try {
               str += fields[i].getName() + "=" + fields[i].get(o);
           }
           catch (IllegalArgumentException e) {
               e.printStackTrace();
           }
           catch (IllegalAccessException e) {
               e.printStackTrace();
           }

           if(i<fields.length -1) {
               str +=  ";" ;
           }else {
               str += ']';
           }

       }

       return str;
   }

   public String toString(Object o, int i) {


       String str = o.getClass().getName() + "[";
       String alt = "";

       @SuppressWarnings("rawtypes")
       Class classe = null;

       try {
           classe = Class.forName(o.getClass().getName());
       }
       catch (ClassNotFoundException e) {
           e.printStackTrace();
       }

       Field[] fields = classe.getDeclaredFields();

       for(int j=0; j<fields.length; j++) {
           fields[j].setAccessible(true);

           try {
               if(fields[j].get(o).getClass() == "[I") {
                   alt = "";
                   int[] inte = (int[]) fields[j].get(o);

                   String separator = "";
                   for(int z=0; z<inte.length; z++) {
                       if(z < 2) {
                           separator = ";";
                       }else {
                           separator = "";
                       }

                       alt += inte[z] + separator;
                   }
               }
               if(j>0 && j<3) {
                   str += fields[j].getName() + "={" + alt + "}";
               }else {
                   str += fields[j].getName() + "=" + fields[j].get(o) ;
               }

           }
           catch (IllegalArgumentException e) {
               e.printStackTrace();
           }
           catch (IllegalAccessException e) {
               e.printStackTrace();
           }

           if(j<fields.length -1) {
               str +=  ";" ;
           }else {
               str += ']';
           }

       }

       return str;
   }
}