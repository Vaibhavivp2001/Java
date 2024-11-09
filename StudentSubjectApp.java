import java.util.*;
class Student{
int []a=new int[6];
int agg;

void setMarks(int[] s){
 for(int i=0;i<6;i++){
 a[i]=s[i];
 }
}
void calPer(){
  int sum=0;
  for(int i=0;i<6;i++){
   sum=sum+a[i];
 }
  agg=sum/6;
  System.out.println("Total marks is "+agg);
 }
void checkGrades(){
 if(agg>70&&agg<100)
{
 System.out.println("Student in distinction");
 }
if(agg>60&&agg<=75){
 System.out.println("First division");
 }
if(agg>=50&&agg<=60){
System.out.println("second dicision");
}
if(agg>40&&agg<=50){
 System.out.println("Third division");
 }
if(agg<40){
System.out.println("fail");
  }
 }
}
public class StudentSubjectApp{
 public static void main(String x[]){
 Scanner sc=new Scanner(System.in);
int [] marks=new int[6];
System.out.println("Enter marks for 6 subject: ");
for(int i=0;i<6;i++){
 marks[i]=sc.nextInt();
}
 Student st=new Student();
 st.setSubjectMarks(marks);
 st.calPer();
 st.checkGrades();
 }
}
