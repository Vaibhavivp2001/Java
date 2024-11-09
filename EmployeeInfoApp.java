import java.util.*;
class Employee{
	int id,bsal,prog,total;;
	String name;
	void setPersonalInfo(int i,String n,int sal){
		id=i;
		name=n;
		bsal=sal;
	}
	void setProgress(int p){
		if(p>60){
			int incre=bsal*30/100;
			total=bsal+incre;
		}
		prog=p;
	}
	void show(){
		System.out.print("\nDisplay Employee Details");
		System.out.print("\nId: "+id);
		System.out.print("\nName: "+name);
		System.out.print("\nBasic Salary: "+bsal);
		System.out.print("\nTotal Salary: "+total);
		System.out.print("\nProgress: "+prog);	
	}
}
public class DisplayEmployeeDetails{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee Id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee Name:");
		String name=sc.nextLine();
		System.out.print("Enter Employee Salary:");
		int sal=sc.nextInt();

		Employee e=new Employee();
		e.setPersonalInfo(id,name,sal);
		System.out.print("Enter Employee Progress:");
		int p=sc.nextInt();
		e.setProgress(p);
		e.show();
	}
}