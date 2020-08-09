package RazaLearning;

interface haiderInt
{
	void name();
	void fullname();
}
   class Abc implements haiderInt   // nothonh just checking for gitignore
           {
 public void name()
   {
     System.out.println("Md Raza");
   }
 public void fullname()
   {
     System.out.println("Haider");
   }
           }
public class NameClass {

  public static void main(String[] args)
    {
   haiderInt Raza= new Abc();
   Raza.name();
   Raza.fullname();
    }
                       }
