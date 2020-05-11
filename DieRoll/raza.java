

import java.util.Random;


public class raza {

  public static void main(String[] args) {
  raza diceroll = new raza();
  
  diceroll.process();
   
  }
      public void  process()  { 
    //  Declare a  constant for  how  many  rolls  we want.
       final  int  NUMROLLS  =  1000000; 
     //  Let’s  try a  million 
     //  Declare an  array  of counters.
     //   All  initialized to  zero.
      // Note:  we  will  not  use  the  first two elements.
          int[]  count  =  new  int[13]; 
    //  Create  a  Random  object  for  simulating  a die.
            Random rand  =  new  Random(); 
            
            
     //  Perform the  desired  number  of rolls:
      for  (int  i=0;  i<NUMROLLS;  i++)  
      {
       // Roll  the  two  dice.
        int  die1 =  rand.nextInt(6)+1; 
        int  die2  =  rand.nextInt(6)+1; 
   //  Increment  the  corresponding counter.
        count[die1+die2]++; 
    } 
      //  After  all  rolls  are  done,  report 
      // percentages: 
      for  (int  i=2; i<count.length; i++)  { 
 System.out.println("The  value  " +  i  +  "  was  rolled  "  +100.0*count[i]/NUMROLLS + "%  of  the  time.");
       }
        } 
        }
