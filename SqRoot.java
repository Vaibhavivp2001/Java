public class XyzApp{
 public static void main(String x[]){
  int no=Integer.parseInt(x[0]);
  int s=no*no;
  System.out.println("Square is="+s);
  }
}


import java.util.*;
public class XyzApp{
  public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no");
  int no=sc.nextInt();
  int a=no*no;
  System.out.println("Square is="+a);
  }
}

import java.util.*;
public class SqRoot{
 public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter thr no");
  int no=sc.nextInt();
  double Sq=Math.sqrt(no);
  System.out.println("Square Root is"+Sq);
 }
}