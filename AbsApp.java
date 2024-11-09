abstract class A
{  abstract void show(); 
} 
class B extends A 
{   void show(){
            System.out.println("I required show in B");
     }
}
public class AbsApp
{ public static void main(String x[])
  {   A a1 = new B();
     a1.show();
  }
}
