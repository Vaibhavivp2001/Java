import java.util.*;
class Power{
int base,index;
void setValue(int b,int i){
 base=b;
 index=i;
 }
int getPower(){
 int power=1;
 for(int i=1;i<=index;i++){
 power=power*base;
 }
 return power;
 }
}
public class PowerApp{
 public static void main(String x[]){
int base,index;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter base and index");
  base=sc.nextInt();
  index=sc.nextInt();
  Power p=new Power();
  p.setValue(base,index);
  int power=p.getPower();
  System.out.println("Power is "+power);
 }
}

