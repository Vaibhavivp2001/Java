class A{
 protected void show(int x){
 System.out.println("x is "+x);
   }
 }
class B extends A{
 public void show(int x){
 System.out.println("x is "+x);
    }
 }
public class OverridingApp{
 public static void main(String x[]){
 B b1=new B();
  }
 }