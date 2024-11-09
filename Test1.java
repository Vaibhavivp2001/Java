import java.util.*;
public class Test1 {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of array");
    int n=sc.nextInt();
    int a[]=new int[n];
     System.out.print("Enter array element:");   
          for(int i = 0; i<n; i++ ){
         for(int j = i+1; j<n; j++){
            if(a[i]>a[j]){
               int temp = a[i];
               a[i] = a[j];
               a[j] = temp;
            }
         }
      }
      System.out.println("2nd Smallest element of the array is:: "+a[0]);
   }
}