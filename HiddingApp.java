class A{
 static void show(){
 System.out.println("I am show parent class");
  } 
 }
class B extends A{
 static void show(){
  System.out.println("I am show child class");
  } 
 }
class C extends A{
  static void show(){
  System.out.println("I am show C class");
  } 
 }
public class HiddingApp{
 public static void main(String x[]){
 A a1=new B();
 a1.show();
 a1=new C();
 a1.show();
 }
}
