import java.util.*;   
  public class Looping13
    {
       public static void main(String x[])
        {
          Scanner xyz=new Scanner(System.in);
          int no,first,last;
          System.out.println("Enter the four digit number");
          no=xyz.nextInt();
         System.out.printf("Before Swapping %d\n",no);
          last=no%10;
          no=no/10;
          first=no/100;
          no=no%100;
          no=last*1000+no*10+first;
          System.out.printf("After Swapping %d\n",no);
        }
   }