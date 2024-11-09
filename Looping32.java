import java.util.*;
public class Looping32
{
	public static void main(String x[])
	{
	 Scanner xyz=new Scanner(System.in);
	 int no,sum=0;
	 System.out.println("Enter the number");
	 no=xyz.nextInt();
	 for(int i=1;i<=no/2;i++)
	 {
	   if(no%i==0)
	   {
	     sum=sum+i;
		}
	 }
		if(sum==no)
		{
			System.out.printf("%d is a perfect number",no);
		}
	 
		else
		{
			System.out.printf("%d is not a perfect number",no);
		}			
	  
	  }
	  }