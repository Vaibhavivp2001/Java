abstract class Animal{
  abstract void sound();
 }
class Lion extends Animal{
   void sound(){
      System.out.println("Lion rors");
  }
}
class Tiger extends Animal{
    void sound(){
        System.out.println("Tiger growls");
  }
}
public class AbsAnimalApp{
 public static void main(String x[]){
 Animal a;
 a=new Lion();
 a.sound();
 a=new Tiger();
 }
}
 
 