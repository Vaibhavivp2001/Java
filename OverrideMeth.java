class A{
 void show(){
 System.out.println("I am parent method"); 
  }
}
class B extends A{
 void show(){
 System.out.println("I am child method");
  }
}
public class OverrideMeth{
 public static void main(String x[]){
 B b1=new B();
 b1.show();
 }
}
