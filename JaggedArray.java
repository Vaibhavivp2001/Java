import java.util.*;
public class ArrayAppDemo
{
    public static void main(String x[])
    {
	 int a[][]=new int[3][]; 
	  a[0]=new int[3];
	  a[1]=new int[4];
          a[2]=new int[2];
	 Scanner xyz  = new Scanner(System.in);
	System.out.println("Enter values in matrix");
	for(int i=0;i<a.length;i++)
	{
	   for(int j=0; j<a[i].length;j++)
	   {
		a[i][j]=xyz.nextInt();
	   }		  
	}
	System.out.println("display the matrix");
	for(int i=0;i<a.length; i++)
	{
	   for(int j=0;j<a[i].length;j++)
	   {
		System.out.printf("%d\t",a[i][j]);
	   }
		System.out.printf("\n");
	}
	 
    }
}

