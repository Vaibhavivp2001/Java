import java.util.*;
class SortArray{
	private int a[];
	
	public void setArray(int a[])
	{
		this.a=a;
	}
	
	public int[] getSortArray()
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-i-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
}
public class Q4ArraySorting{

	public static void main(String x[])
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enetr size of array");
		int size =s.nextInt();
		
		int a[]= new int[size];
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=s.nextInt();
		}
		
		SortArray sort = new SortArray();
		sort.setArray(a);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("%d\t",sort.getSortArray()[i]);
		}
		
	}
	
}
