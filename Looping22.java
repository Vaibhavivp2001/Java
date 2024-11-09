import java.util.*;
public class Looping22
{
 public static void main(String x[])
 {
	int no,i;
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter any number");
    no=xyz.nextInt();
	System.out.println("Factors of number are : ");
	for(i=1;i<=no;i++)
	{
	  if(no%i==0)
	  {
		System.out.println(i);  
	  }	 
	}
 }
}