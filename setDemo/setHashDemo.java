package raza.setDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class setHashDemo {
            public static void main(String[] args){
              Map<String,String> values= new HashMap<>();
              values.put("Roll no.1:", "Raza");
              values.put("Roll no.2: ","Afzal");
              values.put("Roll no.3: ","Faisal");
              
              Set<String> key = values.keySet();  //Prints One By one in different line
              for(String i : key)
              {
                System.out.println(i+values.get(i));
              }
                System.out.println("---------------");               
              System.out.println(values);    // prints values randomly.
              System.out.println("_____________");  
              System.out.println(values.get("Roll no.1:"));    // fetch required value.
              
            }
}
