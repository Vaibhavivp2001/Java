import java.util.*;
class Employee{
	private int id,salary;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	public void setSalary(int sal)
	{
		salary=sal;
	}
	int getSalary()
	{
		return salary;
	}
}
public class Q5EmployeeData{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter salary");
		int sal=sc.nextInt();
		
		Employee e=new Employee();
		e.setId(id);
		e.setName(name);
		e.setSalary(sal);
		
		System.out.printf("\n\nId:%d\nName:%s\nSalary:%d",e.getId(),e.getName(),e.getSalary());
	}
}