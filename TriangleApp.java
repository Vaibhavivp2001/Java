import java.util.*;
 public class TriangleApp{
  public static void main(String x[]){
     System.out.println("Enter the first angle");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println("Enter the second angle");
    int b=sc.nextInt();
     System.out.println("Enter the third angle");
     int c=sc.nextInt();
    if(a+b+c==180 && a>0 && b>0 && c>0)
     {System.out.println("Triangle is valid");
     }
    else{
      System.out.println("Triangle is not valid");
        }
     }
}

