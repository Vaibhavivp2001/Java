import java.util.*;
public class SimpleApp{
 public static void main(String x[]){
  int p,t;
  float r;
  System.out.println("Enter principle");
  Scanner sc=new Scanner(System.in);
  p=sc.nextInt();
 System.out.println("Enter time");
 t=sc.nextInt();
 System.out.println("enter the rate");
 r=sc.nextFloat();
float si=(p*t*r)/100;
System.out.println("Simple intrest= "+si);
}
}