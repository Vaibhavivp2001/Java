class A{
 A(){
  System.out.println("I am parent class constructor");
  }
 }
class B extends A{
 B(){
  System.out.println("I am child class constructor");
  }
 }
public class DefaultCons{
 public static void main(String x[]){
  B b1= new B();
  }
}