class A{
 A(){
 System.out.println("I am parent");
 }
}
class B extends A{
 B(){
   super();
  System.out.println("I am child class");
  }
}
class C extends B{
 C(){
  super();
  System.out.println("I am C");
  }
}
public class DefConsApp{
 public static void main(String x[]){
 B b1=new B();
 }
}