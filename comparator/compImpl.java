package co.raza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;





public class compImpl {

  public static void main(String[] args) {
         
          List<Integer> values = new ArrayList<Integer>();
          values.add(987);
          values.add(963);
          values.add(785);
          values.add(852);
          values.add(125);
          
          Comparator<Integer> com = new compler();  // for printing based on last digits.
          
          Collections.sort(values, com);    // for printing based on last digits,
          // ceated another class.
          
          
          for(int i : values)
          {
            System.out.println(i);
          }
  }
}