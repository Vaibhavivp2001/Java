import java.util.*;
 public class SumOddNo{
  public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no");
  int n=sc.nextInt();
  int sum=0;
  for(int i=1;i<=n;i++)
  {
    if(i%2!=0){
    sum=sum+i;
   }
  }
  System.out.println("Sum of odd no is="+sum);
 }
}