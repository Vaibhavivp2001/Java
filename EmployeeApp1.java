class Employee{
 private int id;
 private String name;
 void setData(int i,String n)
{
   id=i;
   name=n;
 }
 void displayData()
{
  System.out.println("id is "+id);
  System.out.println("Name is "+name);
 }
}
public class EmployeeApp1{
 public static void main(String x[]){
  Employee e=new Employee();
  e.setData(1,"vaibhu");
  e.displayData();
  }
}