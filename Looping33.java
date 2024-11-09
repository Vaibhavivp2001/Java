import java.util.*;
public class Looping33
{
	public static void main(String x[])
	{
		 Scanner xyz=new Scanner(System.in);
		 int i,j,no,sum;
		 System.out.println("Enter the range:");
		 no=xyz.nextInt();
		 for(i=1;i<=no;i++)
		   {
			   sum=0;
			   for(j=1;j<i;j++)
				{
					  if(i%j==0)
					 {
						sum=sum+j;
					 }
				 }
				if(sum==i)
					{
					  System.out.printf("%d\t",i);
		            }
			}
		}
	}