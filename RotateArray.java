import java.util.*;
 public class RotateArray{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter size of array:");
   int n=sc.nextInt();
   int a[]=new int[n];
   System.out.print("Enter array elements:");
   for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    }
    System.out.print("Display Array Before Rotation:");
    for(int i=0;i<n;i++){
       System.out.printf("%d ",a[i]);
     }
     int index,temp;
     System.out.print("\nEnter the index to Rotate Array:");
     index=sc.nextInt();
      for(int i=0;i<index;i++){
       temp=a[0];
         for(int j=0;j<n-1;j++){
              a[j]=a[j+1];
             }
             a[n-1]=temp;
          }
          System.out.print("Display Array After Rotation:");
           for(int i=0;i<n;i++){
             System.out.printf("%d ",a[i]);
            }
      }
}