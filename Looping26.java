import java.util.*;
public class Looping26
{
  public static void main(String x[])
  {
    
	Scanner sc=new Scanner(System.in);
	int no,i,flag=1;
	System.out.println("Enter any number");
	no=sc.nextInt();
	for(i=2;i<no;i++)
	{
		if(no%i==0)
		{
		  flag=0;	
		}	
	}
	if(flag==1 && no!=1)
	{
	  System.out.printf("%d is prime number",no);
	}
	else
	{
	  System.out.printf("%d is not prime number",no);	
	}
  }
}