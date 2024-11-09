public class StudentApp{
 public static void main(String x[]){
  int s1=Integer.parseInt(x[0]);
  int s2=Integer.parseInt(x[1]);
  int s3=Integer.parseInt(x[2]);
  int s4=Integer.parseInt(x[3]);
  int s5=Integer.parseInt(x[4]);
  int s6=Integer.parseInt(x[5]);
  int total=s1+s2+s3+s4+s5+s6;
  float per=total/6;
  System.out.println("Percentage of 6 student is="+per);
  }
}