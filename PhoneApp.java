import java.util.*;
public class PhoneApp{
  public static void main(String x[]){
   Scanner xyz=new Scanner(System.in);
   System.out.println("Enter the no of calls");
   int TotalCalls=xyz.nextInt();
   double BillAmount=0;
    if(TotalCalls<=100)
    {
     BillAmount=200;
    }
    if(TotalCalls<=150)
    {
     BillAmount=200+(TotalCalls-100)*0.6;
    }
    if(TotalCalls<=200)
    {
     BillAmount=200+50*0.6+(TotalCalls-150)*0.5;
    }
    if(TotalCalls<=250)
    {
    BillAmount=200+50-0.6+50*0.5+50-0.4+(TotalCalls-200)*0.40;
    }
    else 
    {
    BillAmount=200+50*0.6+50*0.5+50*0.4+(TotalCalls-250)*0.35;
    }
    System.out.println("Your total bill call is="+BillAmount);
  }
}