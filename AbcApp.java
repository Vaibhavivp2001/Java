import java.io.*;
public class AbcApp{
 public static void main(String x[]){
  double p=Double.parseDouble(x[0]);
  double r=Double.parseDouble(x[1]);
  double t=Double.parseDouble(x[2]);
  double ci=p*(math.pow((1+r/100),t));
  System.out.println("Compound Intrest="+ci);
  }
}