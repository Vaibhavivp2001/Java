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
public class maintoDeleteProduct{
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
		System.out.print("\nEnter Id to Delete Product:");
		int pid=sc.nextInt();
		Boolean found=false;
		int cnt=5;
		for(int i=0;i<cnt;i++){										if(pid==p[i].getId()){
					for (int j = i; j < cnt - 1; j++) {
                                    		p[j] = p[j + 1];
                               		 }
                                	cnt--;
			System.out.print("\nRecord Deleted SuccessFully......");
				found=true;
				break;
			}
		}
		if(!found){
			System.out.println("No Product Found with given Id");
		}
		System.out.print("\nId\tName\tPrice");
		for(int i=0;i<cnt;i++){
	System.out.print("\n"+p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getPrice());
		}

	}
}