import java.util.*;
class AddAmount{
int amount;
AddAmount(){
 System.out.println("No amount will be added to piggie bank");
 }
AddAmount(int amount){
 this.amount=amount;
 }
}
public class PiggieBank{
 public static void main(String x[]){
 Scanner sc=new Scanner(System.in);
 int no=sc.nextInt();
 AddAmount ad=new AddAmount(no);
 
 }
}