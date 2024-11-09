import java.util.*;
import java.lang.Math;
public class Looping30
{
  public static void main(String x[])
  {
    int no,i,temp,rem,count=0;
	double p,sum=0;
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	no=sc.nextInt();
	temp=no;
	while(temp!=0)
	{
	  temp=temp/10;	
	  count++;
	}
	System.out.println(count);
	temp=no;
	while(temp!=0)
	{
		rem=temp%10;
		temp=temp/10;
		p=Math.pow(rem,count);
        sum=sum+p;
	}
	if(sum==no)
	{
	  System.out.println("Number is Armstrong number");
	}
	else
	{
	  System.out.println("Number is not Armstrong number");	
	}
  }
}