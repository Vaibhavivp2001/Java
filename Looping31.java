import java.util.*;
import java.lang.Math;
 
public class Looping31
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		 int no,i,temp,rem,count=0;
		double p,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Limit");
		no=sc.nextInt();
		temp=no;
		System.out.println("Armstrong series is :");
	for(i=1;i<=no;i++)
	{
	  temp=i;
	  count=0;	  
		 while(temp!=0)
		 {
		  temp=temp/10;	
		  count++;
		 }
		  temp=i;
		  sum=0;
		 while(temp!=0)
		 {
			rem=temp%10;
			temp=temp/10;
			p=Math.pow(rem,count);
			sum=sum+p;
		 }
		if(sum==i)
		{
		  System.out.println(sum);
		}
    }
  }
}