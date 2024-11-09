class Reverse{
 private int no;
 public void setValue(int no){
 this.no=no;
 }
public void checkNumber(){
 int no;
 int sum=0;
 for(int i=0;i<no;i++){
 if(no%i==0){
  sum=sum+i;
 }
}
i++;
}
 if(no==sum){
 return true;
 }
 else{
 return false;
 }
}
public class PerfectNoApp{
 public static void main(String x[]){
 Scanner sc=new Scanner(System.in);
 Reverse r=new Reverse();
 Boolean z=r.setValue(no);
 if(z){
System.out.println("Perfect No");
}
else{
System.out.println("Not perfect No");
 }
}
}
