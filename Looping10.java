import java.util.*;
public class Looping10
{
	public static void main(String x[])
	{
	 int no,count=0;
	 Scanner xyz=new Scanner(System.in);
	 System.out.println("Enter any number");
	 no=xyz.nextInt();
	 while(no!=0)
	 {
      no=no/10;
	  count++;
	 }
	System.out.println("Number of digits are" +count);
	}
}