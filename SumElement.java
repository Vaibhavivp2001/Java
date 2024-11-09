import java.util.*;
 public class SumElement{
  public static void main(String x[]){
  int a[]=new int[5];
  int sum=0;
  Scanner xyz=new Scanner(System.in);
 System.out.println("Enter element in array");
 for(int i=0;i<a.length;i++)
{
 a[i]=xyz.nextInt();
}
for(int i=0;i<a.length;i++)
{
   sum=sum+a[i];
}
System.out.println("Sum= "+sum);
}

}