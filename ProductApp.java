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

public class ProductApp{
 public static void main(String x[]){
 Scanner sc=new Scanner(System.in);
 Product []prod=new Product[5]; 
 for(int i=0;i<prod.length;i++){
 prod[i]=new Product();
 System.out.println("Enter product id price name");
 int id=sc.nextInt();
 int price=sc.nextInt();
 String name=sc.next();
 prod[i].setId(id);
 prod[i].setPrice(price);
 prod[i].setName(name);
  }
 for(int i=0;i<prod.length;i++){
  for(int j=i+1;j<prod.length;j++){
  if(prod[i].getPrice()>prod[j].getPrice()){
  Product temp=prod[i];
  prod[i]=prod[j];
  prod[j]=temp;
  }
 }
}
System.out.println("Display details:");
System.out.print("id\t price\t name\t");
for(int i=0;i<prod.length;i++){
System.out.print("\n"+prod[i].getId()+"\t"+prod[i].getPrice()+"\t"+prod[i].getName());
 }
}
}