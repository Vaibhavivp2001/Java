import java.util.*;
class Product{
	private int id;
	private String name;
	private int price;
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
}
public class maintoSearchProductByIdandPrice{
	public static void main(String args[]){
		Product p[]=new Product[5];
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter PRoduct Details:");
		for(int i=0;i<p.length;i++){
			p[i]=new Product();
			System.out.print("\nEnter Id:");
			int id=sc.nextInt();
			p[i].setId(id);
			sc.nextLine();
			System.out.print("\nEnter Name:");
			String name=sc.nextLine();
			p[i].setName(name);
			System.out.print("\nEnter Price:");
			int price=sc.nextInt();
			p[i].setPrice(price);
		}
		System.out.print("\nId\tName\tPrice");
		for(int i=0;i<5;i++){
	System.out.print("\n"+p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getPrice());
		}
		boolean found=false;
		System.out.print("\nEnter Id to Search product:");
		int pid=sc.nextInt();
		for(int i=0;i<5;i++){
			if(pid==p[i].getId()){
				found=true;
	System.out.print("\n"+p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getPrice());
				break;
			}
		}
		if(!found){
			System.out.println("\nNo Product Found with given id");
		}
		found=false;
		System.out.print("\nEnter Price to Search product:");
		int pprice=sc.nextInt();
		for(int i=0;i<5;i++){
			if(pprice==p[i].getPrice()){
				found=true;
	System.out.print("\n"+p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getPrice());
				break;
			}
		}
		if(!found){
			System.out.println("\nNo Product Found with given Price");
		}
	}
}