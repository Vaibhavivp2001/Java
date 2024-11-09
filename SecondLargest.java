import java.util.*;
public class SecondLargest
{
  public static void main(String x[]) 
  {
     int a[]=new int[8];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter element in array");
     for(int i=0;i<a.length;i++)
     {
        a[i]=sc.nextInt();
     }
    for(int i=0;i<a.length;i++)
    {
      for(int j=i+1;j<a.length;j++)
      {
         if(a[i]>a[j])
       { 
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
     }
  }
    System.out.println("Afer assending order");
     for(int i=0;i<a.length;i++)
     {
      System.out.printf("%d",a[i]);
     }
      int count=1;
       for(int i<a.length-1;i>0;i--)
       {
         if(a[i]!=a[i-1])
        {
          count++;  
        }
         if(count==2) 
         {
            System.out.println("Second Largest element is= "+a[i-1]);  
         }
       }
   }
}

  