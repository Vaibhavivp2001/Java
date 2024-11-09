import java.util.*;
public class Looping12
{
	public static void main(String x[])
	{
	 int no,last;
	 Scanner xyz=new Scanner(System.in);
	 System.out.println("Enter any number");
	 no=xyz.nextInt();
	 last=no%10;
	 while(no>=10)
	 {
      no=no/10;
	 }
	System.out.println("First digit is" +(no+last));
	}
}