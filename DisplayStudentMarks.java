import java.util.*;
class Student{
int M[];
int n;
double per;
 void setSubMarks(int s[]){
 M=s;
 n=s.length;
 }
void calculatePer()
{
  double sum=0;
  for(int i=0;i<M.length;i++){
  sum=sum+M[i];
  }
 double percentage=sum/n;
 per=percentage;
 System.out.println("\nPercentage is:"+percentage);
 }
 void checkGrade(){
 if(per>=75 && per<=100){
 System.out.println("Distinction");
 }
 else if(per>=60 && per<=75){
  System.out.println("First division");
  }
 else if(per>=50 && per<=60){
 System.out.println("Seconf division");
 }
 else if(per>=40 && per<=50){
 System.out.println("Third division");
 }
 else{
 System.out.println("Failed");
  }
 }
}
public class DisplayStudentMarks{
 public static void main(String x[]){
 Scanner sc=new Scanner(System.in);
  System.out.println("Enter the subject marks");
 int n=sc.nextInt();
 int M[]=new int[n];
 System.out.println("Enter subject marks");
 for(int i=0;i<n;i++){
 M[i]=sc.nextInt();
  }
 Student s=new Student();
 s.setSubMarks(M);
 s.calculatePer();
 s.checkGrade();
 }
}
 