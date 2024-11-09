import java.util.*;
class Rectangle{
 int l,w;
 void setLengthWidth(int len,int wid){
 l=len;
 w=wid;
 }
void showArea(){
int area=l*w;
System.out.println("Area of rectangle is "+area);
}
}
public class AreaRectangleApp{
 public static void main(String x[]){
 System.out.println("Enter the length and width");
 Scanner sc=new Scanner(System.in);
 int l=sc.nextInt();
 int w= sc.nextInt();
 Rectangle r=new Rectangle();
 r.setLengthWidth(l,w);
 r.showArea();
 }
}