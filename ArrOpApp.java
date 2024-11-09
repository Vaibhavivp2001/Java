import java.util.*;

class ArrOp 
{
	int a[];

    	public ArrOp(int a[]) 
	{       				// parameterized constructor
        	this.a = a;
    	}

    	public void findSecondSmall() 
	{
        	int firstMin = Integer.MAX_VALUE;
        	int secondMin = Integer.MAX_VALUE;

        						// Find first smallest number
        	for (int i = 0; i < a.length; i++) 
		{
        		int num = a[i];
            		if (num < firstMin) 
			{
                		secondMin = firstMin;
                		firstMin = num;
            		}
        	}

        						// Find second smallest number
        	for (int i = 0; i < a.length; i++) 
		{
            		int num = a[i];
            		if (num < secondMin && num != firstMin) 
			{
            	    		secondMin = num;
            		}
        	}

        	if (secondMin == Integer.MAX_VALUE) 
		{
            		System.out.println("There is no second smallest element");
        	} 
		else 
		{
            		System.out.println(secondMin + " is the second smallest number");
        	}
    	}
}

public class ArrOpApp
{
	public static void main(String x[]) 
	{
        	Scanner xyz = new Scanner(System.in);
	
        	System.out.println("Enter size of array: ");
        	int size = xyz.nextInt();

        	int a[] = new int[size];
        	System.out.println("Enter elements in array: ");
        	for (int i = 0; i < size; i++) 
		{
            		a[i] = xyz.nextInt();
        	}

        	ArrOp ao = new ArrOp(a);
        	ao.findSecondSmall();

        	xyz.close();
    	}
}