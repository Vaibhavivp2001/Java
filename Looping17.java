import java.util.*;
public class Looping17
{
	public static void main(String x[])
	{
	 int no,rem,rev=0,temp;
	 Scanner xyz=new Scanner(System.in);
	 System.out.println("Enter any number");
	 no=xyz.nextInt();
	 temp=no;
	 while(temp!=0)
	 {
		 rem=temp%10;
		 temp=temp/10;
		 rev=(rev*10)+rem;
	 }
	 if(no==rev)
	 {
		System.out.println("Number is palindrome"); 
	 }
     else
	 {
		System.out.println("Number is not palindrome");  
	 }		 
	}
}