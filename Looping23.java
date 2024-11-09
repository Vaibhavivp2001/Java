import java.util.*;
public class Looping23
{
 public static void main(String x[])
 {
	int no,i,fact=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    no=sc.nextInt();
	System.out.println("Factorial of number are : ");
	for(i=1;i<=no;i++)
	{
		fact=fact*i;
	}
	 System.out.println(fact);  
 }
}