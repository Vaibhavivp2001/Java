import java.util.*;
public class Looping36
{
  public static void main(String x[])
  {
	Scanner xyz=new Scanner(System.in);
     long  no,i,f,f1=0,f2=1;
	System.out.println("Enter the range:");
	no=xyz.nextLong();
	for(i=1;i<no;i++)
	{
	   f=f1+f2;
	   f1=f2;
	   f2=f;
	   System.out.print(f+" ");
	}
	
   }
  }