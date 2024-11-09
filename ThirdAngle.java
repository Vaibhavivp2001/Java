import java.util.*;
public class ThirdAngle{
 public static void main(String x[]){
   System.out.println("Enter the first angle");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
   System.out.println("Enter the 2nd angle");
   int b= sc.nextInt();
 int c=180-(a+b);
System.out.println("Third angle is= "+c);
  }
}

