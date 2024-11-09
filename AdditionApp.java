class Add{
 int a,b;
 void setValue(int i,int j)
{
  a=i;
  b=j;
 }
 void showAdd()
{
  System.out.printf("Addition is %d",a+b);
 }
}
public class AdditionApp{
 public static void main(String x[]){
  Add ad=new Add();
  ad.setValue(10,20);
  ad.showAdd();
   }
}