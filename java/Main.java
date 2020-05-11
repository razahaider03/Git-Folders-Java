import java.util.Set;
import java.util.TreeSet;

public class Main{
	public static void main(String [] args)
	{
		//	Set<Integer> values = new HashSet<>(); // adds values randomly in HeapMemory 
		//  import HashSet package 
		//	values.add(125);
        //	values.add(1258);
        //	values.add(129);
       //	values.add(98);
        	Set<Integer> values2 = new TreeSet<>();    // adds in sorted order
			values2.add(125);
			values2.add(1258);
			values2.add(129);
			values2.add(98);
			 for (int v : values2)
			 {
			 	System.out.println(v);
			 }
			  	}
}
			 					