public class TempApp{
 public static void main(String x[]){
  float cel=Float.parseFloat(x[0]);
  float fah=Float.parseFloat(x[1]);
  float fah=(cel*9/5)+32;
  float cel=(fah-32)*5/9;
System.out.println("fah="+fah);

  System.out.println("cel="+cel);
  }
}