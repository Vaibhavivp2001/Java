class A{
 static void show(){
 System.out.println("I am show in parent class");
  }
 }
class B extends A{
 static void show(){
 System.out.println("I am show in child class");
 } 
}
public class OverridingStaticApp{
 public static void main(String x[]){
 B b1=new B();
 b1.show();
 }
}