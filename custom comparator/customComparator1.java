
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class customComparator1 {
public static void main(String [] args){
   
      List<Student> studs= new ArrayList<>();
      studs.add(new Student(1,98));
      studs.add(new Student(2,87));
      studs.add(new Student(3,76));
      studs.add(new Student(4,56));
      studs.add(new Student(5,99));
      studs.add(new Student(6,100));
      studs.add(new Student(7,90));
      studs.add(new Student(8,99));
      studs.add(new Student(9,89));
      
      
      for (Student s : studs) {
        System.out.println(s);
      }   
  }
}
class Student {
      int rollno;
      int marks;
    public Student(int rollno, int marks)
      {
      
       this.rollno= rollno;
       this.marks= marks;
       
       }
    public String toString(){
    return "Student{"+ "rollno"+rollno+",marks"+marks+'}';
      
    }
}
     
