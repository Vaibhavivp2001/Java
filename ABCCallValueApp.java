import java.util.*;
class ABC{
 void setValue(int a,int b){
  a=100;
  b=200;
System.out.printf("A=%d\n B=%b\n",a,b);
 }
}
public class ABCCallValueApp{
 public static void main(String x[]){
 ABC ab=new ABC();
 int m=10,n=20;
 System.out.printf("A=%d\nB=%d\n",m,n);
 }
}