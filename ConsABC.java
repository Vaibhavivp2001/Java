//class Bike{
// Bike(){
  //System.out.println("I am default cons");
  //}
//}
// public class ConsBike{
//  public static void main(String x[]){
//    Bike b=new Bike();
  // }
//}


//class Bike1{
 // int id;
 // String name;
  
 // System.out.println(id+ " " +name);
  
//}
// public class ConsBike1{
 // public static void main(String x[]){
   // Bike1 b=new Bike1();
     //Bike1 c=new Bike1();
   //}
//}

//class ABC{
 //int id;
 //String name;
 //ABC(int i,String n){
  //id=i;
 // name=n;
 //}
 // void display(){
 // System.out.println("id is:"+id);
  //System.out.println("name is:"+name);
  //}
//}
 //public class ConsABC{
  // public static void main(String x[]){
  //ABC a=new ABC(12,"vaibhu");
 // a.display();
 //}
//}

class Student{
  int id;
   String name;
   int age;
  Student(int i,String n){
  id=i;
  name=n;
 }
  void display(){
  System.out.pritn(id+ " "+ name);
  }
  Student(int i,String n,int a){
  id=i;
   name=n;
   age=a;
   }
   void display(){
   System.out.println(id+ " " +name + " "+age);
   }
}
 public class ConsStudent{
  public static void main(String x[]){
   Student s1=new Student(1,"vaibhu");
   Student s2=new Student(2,"omiiii",22);
   s1.display();
   s2.dispaly();


  
   