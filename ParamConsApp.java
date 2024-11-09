class A{
 A(int x){
  System.out.println("I am parent class Constructor"+x);
  }
 } 
 class B extends A{
  B(){
   super(100);
  System.out.println("I am child class cons");
  }
}
 public class ParamConsApp{
  public static void main(String x[]){
   B b1=new B();
  }
}

  