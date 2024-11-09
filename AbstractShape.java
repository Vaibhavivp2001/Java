import java.util.Scanner;
abstract class Shape{
 Scanner sc=new Scanner(System.in);
 abstract void calculateArea();
 abstract void calculatePerimeter();
}
class Circle extends Shape{
  void claculateArea(){
    System.out.println("Enter radius of circle");
    int r=sc.nextInt();
    double Area=3.14*r*r;
    System.out.println("Area of Circle is "+Area);
 }
 
  void calculatePerimeter(){
   System.out.println("Enter the radius of circle");
   int r= sc.nextInt();
   double perimeter=2*3.14*r;
   System.out.println("Perimeter of circle is"+perimeter);
 }
}
class Triangle extends Shape{
  void calculateArea(){
  System.out.println("Enter the base of triangle");
  int base=sc.nextInt();
  System.out.println("Enter the height");
  int height=sc.nextInt();
  double Area=0.5*base*height;
  System.out.println("Area of triangle is"+Area);
 }
 void claculatePerimeter(){
 System.out.println("Enter the side1");
 int side1=sc.nextInt();
 System.out.println("Enter the side2");
 int side2=sc.nextInt();
 System.out.println("Enter the side3");
 int side3=sc.nextInt();
 int perimeter=side1+side2+side3;
 System.out.println("Perimeter of Triangle is"+perimeter);
 } 
}
public class AbstractShape {

	public static void main(String[] args) {
		Shape c=new Circle();
		c.calculateArea();
		c.calculatePerimeter();
		c=new Triangle();
		c.calculateArea();
		c.calculatePerimeter();

	}

}