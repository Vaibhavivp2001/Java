import java.util.*;
public class TriangleType{
public static void main(String x[]){
System.out.println("Enter the fist side");
Scanner sc= new Scanner (System.in);
int s1=sc.nextInt();
System.out.println("Enter the second side");
int s2=sc.nextInt();
System.out.println("Enter the third side");
int s3=sc.nextInt();
if(s1==s2 && s2==s3 && s3==s1)
{System.out.println("Equilateral triangle");
}
else if(s1==s2 || s2==s3 || s3==s1)
{System.out.println("Isoscale triangle");
}
else{
System.out.println("Scalen triangle");
}
}
}







 