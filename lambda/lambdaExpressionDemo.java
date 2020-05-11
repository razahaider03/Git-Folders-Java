package co.raza;

public class lambdaExpressionDemo {

  public static void main(String[] args) {
           double d1=100;
           double d2=250;
           double d3=369;
           System.out.println(->(d1>d2?1:d1<d2?-1:0));       
  }
}
