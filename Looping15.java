import java.util.*;
public class Looping15
{
	public static void main(String x[])
	{
	 int no,mul=1,rem;
	 Scanner xyz=new Scanner(System.in);
	 System.out.println("Enter any number");
	 no=xyz.nextInt();
	 while(no!=0)
	 {
		 rem=no%10;
		 no=no/10;
		 mul=mul*rem;
	 }
	System.out.println("sum of digit is" +mul);
	}
}