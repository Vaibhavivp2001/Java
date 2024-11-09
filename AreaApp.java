import java.util.*;
class Circle{
float r;
void setRadius(float radius)
{  r=radius;
}
void showArea(){
 double area=3.14*r*r;
 System.out.println("Area of circle is "+area);
}
}
public class AreaApp{
 public static void main(String x[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the radius");
 float radius=sc.nextFloat();
  Circle c=new Circle();
  c.setRadius(radius);
  c.showArea();
  }
}