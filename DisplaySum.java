import java.util.*;
class Sum{
 void calSum(int ...x){
 int sum=0;
for(int i=0;i<x.length;i++){
 sum=sum+x[i];
 }
 System.out.println("Sum is: "+sum);
 }
}
public class DisplaySum{
 public static void main(String args[]){
 Sum s=new Sum();
 int x[]=new int[]{10,20,30,40,50};
 s.calSum(x);
 }
}
 