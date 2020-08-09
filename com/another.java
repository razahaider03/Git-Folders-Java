

public class another
{

public static void main(String[] args)        
      {
      // Methods, return statement
  double r =8, volume, VolumeRound2;
  
  volume=(SphereVol(r)); 
  VolumeRound2=Math.round(volume*100.0)/100.0;
  System.out.println("Volume of sphere is: "+VolumeRound2);
      }
  
public static double SphereVol(double r)
      {
                                return(4.0/3.0)*Math.PI*Math.pow(r,3);
     }
      
     
 }
