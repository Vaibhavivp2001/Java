import java.util.*;
public class Looping21{
 public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the base and exponant");
  int base=sc.nextInt();
  int expo=sc.nextInt();
  long power=1;
  for(int i=1;i<=expo;i++){
  power=power*base;
  }
  System.out.printf("%d ^ %d=%ld",base,expo,power);
  }
 }