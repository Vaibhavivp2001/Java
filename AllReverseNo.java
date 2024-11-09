import java.util.*;
public class AllReverseNo{
 public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the ending no");
  int e=sc.nextInt();
  System.out.println("Enter the starting no");
  int s=sc.nextInt();
  while(e>s)
  {
    System.out.println(e);
    e--;
   }
  }
}
