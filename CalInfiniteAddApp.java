import java.util.*;
class CalAdd{
int sum=0;
void sum(String y,int ...x)
{ 
  for(int i=0;i<x.length;i++)
  {
     sum=sum+x[i];
   }
 System.out.printf("Addition is %d\n",sum);
}
}
public class CalInfiniteAddApp{
 public static void main(String x[]){
 CalAdd ad=new CalAdd();
 ad.sum("Abc",10,20,30);
  }
}