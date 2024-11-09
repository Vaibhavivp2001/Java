import java.util.*;
class Rectangle{
 int length ,breadth,area;
 Rectangle(){
 length=0;
 breadth=0;
} 
Rectangle(int length,int breadth){
this.length=length;
this.breadth=breadth;


}
Rectangle(int length){
this.length=length;
breadth=length;

}
 void display(){
 area=length*breadth;
 System.out.println("Area is:"+area);
 }
}
 public class ConsRectangleApp{
 public static void main(String x[]){
 Scanner sc=new Scanner(System.in);
 int a,b;
 System.out.printf("Enter the length and breadth");
a=sc.nextInt();
b=sc.nextInt();
Rectangle r=new Rectangle();
 r.display();
r=new Rectangle(a,b);
r.display();
r=new Rectangle(a);
r.display();
 }
}
