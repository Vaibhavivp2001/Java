public class IntrestApp{
 public static void main(String x[]){
  float p=Float.parseFloat(x[0]);
  float r=Float.parseFloat(x[1]);
  float t=Float.parseFloat(x[2]);
  float si=(p*r*t)/100;
  System.out.println("Simple intrest is="+si);
  }
}