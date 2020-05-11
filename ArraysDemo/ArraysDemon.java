package ArraysDemo;

public class ArraysDemon 
{

  public static void main(String[] args)
  {
 ArraysDemon arr= new ArraysDemon();
 arr.process("99 98 99 97 96 95 100 89 90 76");
  }
  
  public void process(String input)
           {
      String[] vals= input.split(" ");
      int[] score=new int[vals.length];
      int total=0;
      for(int i=0; i<score.length; i++)
           {            
          score[i]=Integer.parseInt(vals[i]);
          total+=score[i];                  
            }
 double Average=(double)total/score.length;
      System.out.println("the Avg is:- "+Average);              
    }
}
    
  