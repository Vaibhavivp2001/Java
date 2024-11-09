import java.util.*;
 public class Looping28
 {
	 public static void main(String x[])
	 {
		 Scanner xyz =new Scanner(System.in);
		 int no,i,j,flag=1,sum=0;
		 System.out.println("Enter the Limit");
		 no=xyz.nextInt();
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
					 sum=sum+i;
				 }
		 }
		 System.out.println(sum);
	 }
 }