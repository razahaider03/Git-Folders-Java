package setDemo;

import java.util.HashMap;


public class HashMapDemo {
public static void main(String [] args){

HashMap<String,Integer> map=new HashMap<>();
  map.put("abc",12);
  map.put("Raza",1000);
  map.put("Kashif",999);
  map.put("Hasan",987);
  System.out.print(map);
  System.out.print("-------\n");
  map.remove("abc");
  System.out.print(map);
  System.out.print("-------\n");
  int a=map.get("Hasan");
  System.out.println(a);
  map.put("Hasan",1234);
  System.out.print("-------\n");
  System.out.print(map);
}
 
}

