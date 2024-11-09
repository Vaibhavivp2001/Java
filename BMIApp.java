public class BMIApp{
 public static void main(String x[]){
   float height=Float.parseFloat(x[0]);
   float weight=Float.parseFloat(x[1]);
   
   double bmi=(weight/((height/100.0)*(height/100.0)));

if(bmi<18.5)
{
System.out.println("Underweight");
}
else if(bmi>=18.5&&bmi<24.9)
{ 
System.out.println("NormalWeight");
}
else if(bmi>=25 && bmi<29.5)
{
System.out.println("OverWeight");
}
else if(bmi>=30)
{
System.out.println("Obesity");
}
else
{
System.out.println("None");
}
}
}



