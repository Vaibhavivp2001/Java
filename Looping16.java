import java.util.*;
public class Looping16
{
	public static void main(String x[])
	{
	 int no,rem,rev=0;
	 Scanner xyz=new Scanner(System.in);
	 System.out.println("Enter any number");
	 no=xyz.nextInt();
	 while(no!=0)
	 {
		 rem=no%10;
		 no=no/10;
		 rev=(rev*10)+rem;
	 }
	System.out.println("Reverse no is:" +rev);
	}
}