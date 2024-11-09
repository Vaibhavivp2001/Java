import java.util.*;
class Product{
 private int id,price;
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
 public int getPrice()
 {
 return price;
 }
public void setName(String n){
 name=n;
}
 public String getName(){
 return name;
 }
}
public class ProductArrayApp{
 public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
  Product[] p=new Product[5]; 
 for(int i=0;i<p.length;i++){
 p[i]=new Product();
 System.out.println("Enter product id");
 int id=sc.nextInt();
 p[i].setId(id);
 System.out.println("Enter product price");
  int price=sc.nextInt();
 p[i].setPrice(price);
 sc.nextLine();
 System.out.println("Enter product name");
 String name=sc.nextLine();
 p[i].setName(name);
 }
 for(int i=0;i<p.length;i++){
  for(int j=i+1;j<p.length;j++){
  if(p[i].getPrice()>p[j].getPrice()){
   Product temp=p[i];
  p[i]=p[j];
  p[j]=temp;
  }
 }
}
System.out.print("\nDisplay Product details:");
System.out.print("\nId\tPrice\tname");
for(int i=0;i<p.length;i++){
System.out.print("\n"+p[i].getId()+"\t"+p[i].getPrice()+"\t"+p[i].getName());
}
}
}