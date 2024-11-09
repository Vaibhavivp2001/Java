import java.util.*;
public class Looping29
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
	int i,j,no,isPrime;
	 System.out.println("Enter the any number:");
	 no=xyz.nextInt();
	 System.out.printf("All Prime Factors of %d are: ",no);
	 for(i=2;i<=no;i++)
	 {
		 if(no%i==0)
		 {
			 isPrime=1;
			 for(j=2;j<=i/2;j++)
			   {
					 if(i%j==0)
					 {
						 isPrime=0;
						 break;
					 }
			   }
			   if(isPrime==1)
			   {
				   System.out.printf("%d ",i);
			   }
		 }
	 }
 }
}