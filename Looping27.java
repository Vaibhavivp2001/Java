import java.util.*;
public class Looping27
{
  public static void main(String x[])
  {
    int no,i,j,flag=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Limit:");
	no=sc.nextInt();
	for(i=2;i<=no;i++)
	{
	  flag=1;
	  for(j=2;j<i;j++)
	  {		  
		if(i%j==0)
		{
		  flag=0;
		}	
	  }
	 if(flag==1)
	 {		 
	  System.out.println(i);
	 }
	}
	
  }
}