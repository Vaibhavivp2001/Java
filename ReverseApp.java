import java.util.*;
class Reverse
      {
           int no;//6
           public void setValue(int x)//method to setvalue
            {
              this.no=no;
            }
	
	   boolean CheckPerfectNumber()//function to check perfectnumber
          {
		int sum=0,i=1;
		while(i<no)
                {
			if(no%i==0)
                   {
				sum=sum+i;
			 }
			i++;
		}
          
		if(sum==no)
		    return true;
		else 	
			return false;

	}
}
public class PerfectNumberApp
 {
   public static void main(String x[])
     {
       Scanner xyz=new Scanner(System.in);
       System.out.println("Enter the Number=");
       int num=xyz.nextInt();
       Reverse r= new Reverse();
       r.setValue(num);
       boolean z =r.CheckPerfectNumber();
       if(z)
        {
            System.out.println("It is perfect Number:");
         }
        else
          {
            System.out.println("It is not a Perfect Number:");
          }
   }  
}