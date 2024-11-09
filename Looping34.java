import java.util.*;
public class Looping34
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int i,originalno,no,lastdigit,sum;
		int fact;
		System.out.println("Enter the no");
		no=xyz.nextInt();
		originalno=no;
		sum=0;
		while(no>0)
		{
			lastdigit=no%10;
			fact=1;
			for(i=1;i<=lastdigit;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			no=no/10;
		}
		if(sum==originalno)
		{
			System.out.printf("%d is strong no",originalno);
		}
		else
		{
			System.out.printf("%d is Not strong no",originalno);
		}
	}
}