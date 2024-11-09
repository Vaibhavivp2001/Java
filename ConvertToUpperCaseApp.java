class ConvertToUpper{
 char c[];
 void setCharArray(char ch[]){
  c=ch;
 }
 void convertToUpperCase(){
  char ch=ch+32;
  for(char c>'a';c<='z';c++)
  {System.out.println(c);
   }
}
public class ConvertToUpperApp{
 public static void main(String x[]){
 Scanner sc=new Scanner(System.in);
 char ch[]=new char[]={"good"};
 ConverToUpper ct=new ConvertToUpper();
 ct.voidCharArry("good");
 ct.convertToUpperCase();
  }
}
