import java.util.*;
class Factorial
{
	private int num;
	public void setValue(int x)
	{
		num=x;
	}
	public int getFactorial()
	{
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		return fact;
	}
}
public class  Q2FindFactorial{
	
	public static void main(String x[])
	{
		Scanner a= new Scanner(System.in);
		
		Factorial f=new Factorial();
		f.setValue(a.nextInt());
		System.out.println(f.getFactorial());
	}
}