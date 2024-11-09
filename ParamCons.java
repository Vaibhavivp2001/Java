class A{
 A(int x){
 System.out.println("I am parent class Constuctor "+x);
 }
}
class B extends A{
 B(){
      super(20);
      System.out.println("I am child class Constrictor");
    }
}
public class ParamCons{
 public static void main(String x[]){
  B b1=new B();
 }
}