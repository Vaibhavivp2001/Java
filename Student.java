import java.util.*;
public class Student
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter the name");
    String name=xyz.nextLine();
    System.out.printf("Enter the id");
    int id=xyz.nextInt();
    System.out.printf("Enter the percentage");
    float per=xyz.nextFloat();
    System.out.printf("name is=%s\n",name);
    System.out.printf("id is=%d\n",id);
    System.out.printf("percentage is=%f",per);

   }
}