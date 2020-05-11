package raza;

import java.util.ArrayList;


public class ArrayListDemo {

  public static void main(String[] args) {
   
   ArrayList list=new ArrayList();
   list.add("raza");
   list.add("haider");
   list.add("kashif");
   list.add("hasan");
   list.add("shabina");
   list.add("ammi");
   System.out.print("family list is: "
   +list+"\n");
   Object o= list.get(4);
   System.out.print("4th is "+o+"---------\n");
   
   list.set(0,"Abbu");
   System.out.print(list+"----------\n");
   
   for(int i=0;i<list.size();i++)
   {
     System.out.println(list.get(i));
   }
   System.out.print("\n------------\n");
   list.remove(3);
   System.out.print("new list is; "+list);  
  }
}
