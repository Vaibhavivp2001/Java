import java.util.*;
 public class AllEvenNo{
  public static void main(String x[]){
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no");
     int no=sc.nextInt();
     int i=2;
     while(no>=i)
     {
       System.out.println(i);
       i=i+2;
      }
   }
}