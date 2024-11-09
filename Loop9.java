import java.util.*;
public class Loop9
{
	public static void main(String x[])
	{
	 int no,i=1,mul=1;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter any number");
	 no=sc.nextInt();
	 System.out.println("Multiplication table is");
	 while(i<=10)
	 {
	   mul=no*i; 
	   System.out.println(mul);
	   i++;
	 }
	}
}