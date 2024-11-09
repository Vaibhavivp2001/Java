import java.util.*;
public class Second
{
   public static void main(String x[])
   {   
      System.out.println("Enter the character");
        Scanner sc=new Scanner(System.in);
         char ch=sc.next().charAt(0);
      if(ch=='a'||ch=='e' || ch=='i' || ch=='o'|| ch=='u')
   {
     System.out.println("Character is Vowel");
   }
     else
   {
     System.out.println("Character is Consonant");
   }
  }
}
      
     