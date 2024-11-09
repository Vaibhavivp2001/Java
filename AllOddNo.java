import java.util.*;
 public class AllOddNo{
 public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no");
  int no=sc.nextInt();
  int i=1;
  while(no>=i){
  System.out.println(i);
  i=i+2;
  }
 }
}