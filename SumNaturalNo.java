import java.util.*;
 public class SumNaturalNo{
 public static void main(String x[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the no");
 int n=sc.nextInt();
 int sum=0;
 for(int i=1;i<=n;i++)
 {
   sum=sum+i;
  }
 System.out.println("Sum of all natural no is="+sum);
 }
}