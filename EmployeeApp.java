import java.util.*;
class Employee{
int eid;
String ename;
String eaddress;
String eemail;
double esal;
 void setEmployee(int id,String name,String address,String email,double sal)
{
eid=id;
ename=name;
eaddress=address;
eemail=email;
esal=sal;
}
void showDetails()
{
 System.out.println("Employee Id:= "+eid);
 System.out.println("Employee name:= "+ename);
 System.out.println("Employee address:= "+eaddress);
 System.out.println("Employee email:= "+eemail);
 System.out.println("Employee sal:= "+esal);
 }
} 
 public class EmployeeApp{
  public static void main(String x[]){ 
  Employee.emp1=new Employee();
  emp1.setEmployee(101, "Vaibhu" , "102 Shivaji Chowk" , "vaibhavi@2001" , 1000000);
  emp1.showDetails();
 }
}
 








  