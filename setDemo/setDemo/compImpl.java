package setDemo;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


public class compImpl {

  public static void main(String[] args) {
         
         List<Integer> values = new ArrayList<Integer>();
          values.add(987);
          values.add(963);
          values.add(785);
          values.add(852);
          values.add(125);
          
          
          Collections.sort(values);
          
          for(int i : values)
          {
            System.out.println(i);
          }
   
  }

}
