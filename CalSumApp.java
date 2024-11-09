class CalSum{
 int sum=0;
 void sum(int ...x){
 for(int i=0;i<x.length;i++)
 {
    sum=sum+x[i];
  }
 System.out.printf("Addition is %d\n",sum);
 }
}
public class CalSumApp{
 public static void main(String x[]){
  CalSum cs=new CalSum();
  cs.sum(10,20,30,40,50);
  }
}