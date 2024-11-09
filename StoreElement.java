import java.util.*;
public class StoreElement
{
 public static void main(String x[])
{
   Scanner sc=new Scanner(System.in);
  int a[];
  a=new int[5];
  System.out.println("Enter element in array");

  for(int i=0; i<a.length; i++)
  {
    a[i]=sc.nextInt();
  }
 System.out.println("Dispaly array element");
 for(int i=0;i<a.length;i++)
{
 System.out.printf("%d\t",a[i]);
}
}
}