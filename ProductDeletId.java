import java.util.*;
class Product{
private int id;
private int price;
private String name;
public void setId(int i){
 id=i;
 }
public int getId(){
 return id;
 }
public void setPrice(int p){
 price=p;
 }
public int getPrice(){
 return price;
 }
public void setName(String n){
 name=n;
 }
public String getName(){
 return name;
 }
}
public class ProductDeletId{
 public static void main(String x[]){
 Scanner sc=new Scanner(System.in);
 Product[] p=new Product[5];
 for(int i=0;i<p.length;i++){
   p[i]=new Product;
   System.out.println("Enter the product id price name");
  int id=sc.nextInt();
  int price=sc.nextInt();
  String name=sc.next();
  p[i].setId(id);
  p[i].setPrice(price);
  p[i].setName(name);
 }
 System.out.println("Enter the index to delete element");
  int index=sc.nextInt();
 if(id==index){
  index;
  
 }
}