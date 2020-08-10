package random;

import java.util.Random;


public class process {

  public static void main(String[] args) {
      
		System.out.println("Hello World!");
		System.out.println();
		Random rand= new Random();
		int tries=0,die1,die2;
		do{
			 die1= rand.nextInt(6)+1;
			 die2= rand.nextInt(6)+1;
		 System.out.println(die1+"&"+die2);
			tries++;
		  }
		while (die1 != die2);
		System.out.println("it took "+tries+" Attempt");
	     }
		}
