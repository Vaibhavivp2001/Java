abstract class Animal{
  abstract void sound();
 }
class Lion extends Animal{
   void sound(){
      System.out.println("Lion Sound: rors");
  }
}
class Tiger extends Animal{
    void sound(){
        System.out.println("Tiger Sound: growls");
  }
}
public class AbsAnimalApp{
 public static void main(String x[]){
 Animal a=new Lion();
    a.sound();
    a=new Tiger();
    a.sound();
 }
}
 
 