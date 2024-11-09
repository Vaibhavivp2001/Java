import java.util.*;
public class Looping25{
 public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter two no");
  int n1=sc.nextInt();
  int n2=sc.nextInt();
  int max,lcm=1,i;
  max=n1>n2?n1:n2;
   i=max;
   while(true){
   if(i%n1==0 && i%2==0)
    {
      lcm=i;
      break;
    }
   i=i+max;
   }
 System.out.printf("\n lcm of %d and %d is:%d",n1,n2,lcm);
  }
}